package com.fourfree.intranet.dept.repository;

import com.fourfree.intranet.dept.dto.DeptDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class DeptRepositoryTest {

    @Autowired
    DeptRepository deptRepository;

    @Test
    void 전체조회() {
        List<DeptDto> deptDtos = deptRepository.findAll().stream()
                .map(
                        m -> DeptDto.builder()
                                .dept(m)
                                .build()
                )
                .collect(Collectors.toList());

        Assertions.assertEquals(deptDtos.size(),168);
    }
}
