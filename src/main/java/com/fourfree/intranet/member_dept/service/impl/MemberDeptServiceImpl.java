package com.fourfree.intranet.member_dept.service.impl;

import com.fourfree.intranet.member_dept.dto.MemberDeptJoinDeptDto;
import com.fourfree.intranet.member_dept.dto.MemberDeptJoinDeptSearchCondition;
import com.fourfree.intranet.member_dept.repository.MemberDeptRepository;
import com.fourfree.intranet.member_dept.service.MemberDeptService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberDeptServiceImpl implements MemberDeptService {

    private final MemberDeptRepository memberDeptRepository;

    @Override
    public MemberDeptJoinDeptDto selectOneJoinMbid(MemberDeptJoinDeptSearchCondition condition) {
        return memberDeptRepository.selectOneJoinMbId(condition);
    }
}
