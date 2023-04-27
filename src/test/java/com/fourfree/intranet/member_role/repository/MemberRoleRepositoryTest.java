package com.fourfree.intranet.member_role.repository;

import com.fourfree.intranet.member_role.dto.MemberRoleDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberRoleRepositoryTest {

    @Autowired
    MemberRoleRepository memberRoleRepository;

    @Test
    void 전체조회_mbId() {
        List<MemberRoleDto> memberRoleDtos = memberRoleRepository.findByMbId("juyeon").stream()
                .map(
                        m -> MemberRoleDto.builder()
                                .memberRole(m)
                                .build()
                )
                .collect(Collectors.toList());

        System.out.println("memberRoleDtos = " + memberRoleDtos);
    }

}
