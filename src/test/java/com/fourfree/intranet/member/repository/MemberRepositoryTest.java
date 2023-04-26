package com.fourfree.intranet.member.repository;

import com.fourfree.intranet.member.dto.MemberDto;
import com.fourfree.intranet.member.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberRepositoryTest {


    @Autowired
    MemberRepository memberRepository;

    @Test
    public void 전체조회() {
        List<MemberDto> memberDtos = memberRepository.findAll().stream()
                .map(
                        m -> MemberDto.builder()
                                .member(m)
                                .build()
                )
                .collect(Collectors.toList());

        assertThat(memberDtos.size()).isEqualTo(1301);
    }

    @Test
    public void 단일조회() {
        MemberDto memberDto = MemberDto.builder()
                .member(memberRepository.findByMbId("thdi4564"))
                .build();

        assertThat(memberDto.getMbName()).isEqualTo("조소야");
    }
}
