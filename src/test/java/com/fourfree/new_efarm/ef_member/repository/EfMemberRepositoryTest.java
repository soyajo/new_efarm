package com.fourfree.new_efarm.ef_member.repository;

import com.fourfree.new_efarm.ef_member.entity.EfMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@Transactional
class EfMemberRepositoryTest {

    @Autowired
    EfMemberRepository efMemberRepository;

    @Test
    public void 전체조회() {
        List<EfMember> efMembers = efMemberRepository.findAll();

        assertThat(efMembers.size()).isEqualTo(1395);
    }

    @Test
    public void 단일조회() {
        EfMember efMember = efMemberRepository.findByMbId("thdi4564");

        assertThat(efMember.getMbName()).isEqualTo("조소야");
    }
}
