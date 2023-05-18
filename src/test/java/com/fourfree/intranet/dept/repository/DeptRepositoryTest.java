package com.fourfree.intranet.dept.repository;

import com.fourfree.intranet.dept.dto.DeptDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${test.name}")
    private String name;

    @Value("${test.age}")
    private int age;

    @Test
    void 전체조회() {
        List<DeptDto> deptDtos = deptRepository.findAll().stream()
                .map(
                        m -> DeptDto.builder()
                                .dept(m)
                                .build()
                )
                .collect(Collectors.toList());
        System.out.println("#### name : " +  name);
        System.out.println("#### age : " + age);
        Assertions.assertEquals(deptDtos.size(),168);
    }
}
