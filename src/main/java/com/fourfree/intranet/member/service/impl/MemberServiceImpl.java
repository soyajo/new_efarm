package com.fourfree.intranet.member.service.impl;

import com.fourfree.intranet.member.dto.MemberDto;
import com.fourfree.intranet.member.service.MemberService;
import com.fourfree.intranet.member.entity.Member;
import com.fourfree.intranet.member.repository.MemberRepository;
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

    @Override
    public List<MemberDto> selectAll() {

        List<Member> members = memberRepository.findAll();

        List<MemberDto> MemberDtos = members.stream()
                .map(
                        m -> MemberDto.builder()
                                .member(m)
                                .build()
                )
                .collect(Collectors.toList());

        return MemberDtos;
    }

    @Override
    public MemberDto selectOneMbId(String mbId) {

        Member findMember = memberRepository.findByMbId(mbId);

        return MemberDto.builder()
                .member(findMember)
                .build();
    }
}
