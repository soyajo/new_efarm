package com.fourfree.intranet.member.service.impl;

import com.fourfree.intranet.member.dto.MemberDto;
import com.fourfree.intranet.member.entity.Member;
import com.fourfree.intranet.member.repository.MemberRepository;
import com.fourfree.intranet.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceImplTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    void selectAll() {

        // given - 설정

        // when - 로직실행
        List<Member> members = memberRepository.findAll();
        // then - 결과

        assertThat(members.size()).isEqualTo(1301);
    }

    @Test
    void selectOneMbId() {

        Member member = memberRepository.findByMbId("thdi4564");

        assertThat(member.getMbName()).isEqualTo("조소야");
    }
}
