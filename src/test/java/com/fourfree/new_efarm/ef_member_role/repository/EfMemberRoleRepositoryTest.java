package com.fourfree.new_efarm.ef_member_role.repository;

import com.fourfree.new_efarm.ef_member.repository.EfMemberRepository;
import com.fourfree.new_efarm.ef_member_role.dto.EfMemberRoleDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class EfMemberRoleRepositoryTest {

    @Autowired
    private EfMemberRoleRepository efMemberRoleRepository;

    @Test
    void 전체조회() {
        List<EfMemberRoleDto> efMemberRoleDtos = efMemberRoleRepository.findAll().stream()
                .map(
                        m -> EfMemberRoleDto.builder()
                                .efMemberRole(m)
                                .build()
                ).collect(Collectors.toList());

        System.out.println("efMemberRoleDtos = " + efMemberRoleDtos);
    }

    @Test
    void 전체조회_mbId() {
        List<String> efMemberRoleDtos = efMemberRoleRepository.findAllByMbId("chochanho").stream()
                .map(
                        m -> EfMemberRoleDto.builder()
                                .efMemberRole(m)
                                .build()
                )
                .map(EfMemberRoleDto::getRoId)
                .collect(Collectors.toList());
        System.out.println("efMemberRoleDtos = " + efMemberRoleDtos);
    }

}
