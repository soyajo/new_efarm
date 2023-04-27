package com.fourfree.intranet.role.repository;

import com.fourfree.intranet.member.repository.MemberRepository;
import com.fourfree.intranet.role.dto.RoleDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class RoleRepositoryTest {

    @Autowired
    RoleRepository roleRepository;

    @Test
    void 전체조회() {
        List<RoleDto> roleDtos = roleRepository.findAll().stream()
                .map(
                        m -> RoleDto.builder()
                                .role(m)
                                .build()
                )
                .collect(Collectors.toList());

        System.out.println("roleDtos = " + roleDtos);
    }
}
