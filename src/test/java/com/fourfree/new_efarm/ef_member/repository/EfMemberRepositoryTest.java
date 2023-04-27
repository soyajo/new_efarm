package com.fourfree.new_efarm.ef_member.repository;

import com.fourfree.intranet.member.dto.MemberDto;
import com.fourfree.intranet.member.repository.MemberRepository;
import com.fourfree.new_efarm.ef_member.dto.EfMemberDto;
import com.fourfree.new_efarm.ef_member.entity.EfMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@Transactional
class EfMemberRepositoryTest {

    @Autowired
    EfMemberRepository efMemberRepository;

    @Test
    public void 전체조회() {
        List<EfMemberDto> efMemberDtos = efMemberRepository.findAll().stream()
                .map(
                        m -> EfMemberDto.builder()
                                .efMember(m)
                                .build()
                )
                .collect(Collectors.toList());

        assertThat(efMemberDtos.size()).isEqualTo(1395);
    }

    @Test
    public void 단일조회() {
        EfMemberDto efMemberDto = EfMemberDto.builder()
                .efMember(efMemberRepository.findByMbId("thdi4564").get())
                .build();

        assertThat(efMemberDto.getMbName()).isEqualTo("조소야");
    }
}
