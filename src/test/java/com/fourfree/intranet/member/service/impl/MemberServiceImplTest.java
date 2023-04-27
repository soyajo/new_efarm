package com.fourfree.intranet.member.service.impl;

import com.fourfree.intranet.member.dto.MemberDto;
import com.fourfree.intranet.member.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
class MemberServiceImplTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    void 단일조회_mbId() {
        MemberDto memberDto = MemberDto.builder()
                .member(memberRepository.findByMbId("thdi4564").get())
                .build();

        System.out.println("memberDto = " + memberDto);

    }
}
