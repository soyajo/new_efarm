package com.fourfree.intranet.member_dept.repository.impl;

import com.fourfree.intranet.member_dept.dto.MemberDeptJoinDeptDto;
import com.fourfree.intranet.member_dept.dto.MemberDeptJoinDeptSearchCondition;
import com.fourfree.intranet.member_dept.repository.MemberDeptRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
class MemberDeptRepositoryImplTest {

    @Autowired
    private MemberDeptRepository memberDeptRepository;

    @Test
    void memberDeptJoinDept단일조회_mbId() {
        MemberDeptJoinDeptDto memberDeptJoinDeptDto = memberDeptRepository.selectOneJoinMbId(
                MemberDeptJoinDeptSearchCondition.builder()
                        .mbId("thdi4564")
                        .build()
        );

        System.out.println("memberDeptJoinDeptDto = " + memberDeptJoinDeptDto);
    }
}
