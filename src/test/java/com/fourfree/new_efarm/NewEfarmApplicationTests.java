package com.fourfree.new_efarm;

import com.fourfree.intranet.member.entity.Member;
import com.fourfree.intranet.member.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@Transactional
class NewEfarmApplicationTests {

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void memberSelect() {
        // given - 설정
        List<Member> members = memberRepository.findAll();

        System.out.println("members = " + members);
        // when - 로직실행
//        Member findMember = memberRepository.findByMbId("thdi4564");

        // then - 결과
//        assertThat(findMember.getMbName()).isEqualTo("조소야");
    }

    @Test
    void contextLoads() {

    }

}
