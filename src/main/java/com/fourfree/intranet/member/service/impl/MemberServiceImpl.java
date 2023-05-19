package com.fourfree.intranet.member.service.impl;

import com.fourfree.intranet.member.dto.MemberDto;
import com.fourfree.intranet.member.service.MemberService;
import com.fourfree.intranet.member.entity.Member;
import com.fourfree.intranet.member.repository.MemberRepository;
import com.fourfree.intranet.member_dept.dto.MemberDeptJoinDeptDto;
import com.fourfree.intranet.member_dept.dto.MemberDeptJoinDeptSearchCondition;
import com.fourfree.intranet.member_dept.service.MemberDeptService;
import com.fourfree.intranet.member_role.dto.MemberRoleDto;
import com.fourfree.intranet.member_role.service.MemberRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final MemberDeptService memberDeptService;
    private final MemberRoleService memberRoleService;

    @Override
    public MemberDto selectOneMbId(String mbId) {
        MemberDto memberDto = MemberDto.builder()
                .member(memberRepository.findByMbId(mbId).get())
                .build();
        memberDto.setMemberDeptJoinDeptDto(memberDeptService.selectOneJoinMbid(
                MemberDeptJoinDeptSearchCondition.builder()
                        .mbId(mbId)
                        .build()
        ));

//        memberDto.getTemp().put("MemberRoleDtos", memberRoleService.selectAllMbId(mbId).stream()
//                .map(MemberRoleDto::getRoId)
//                .collect(Collectors.toList()));


        return memberDto;
    }
}
