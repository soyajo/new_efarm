package com.fourfree.intranet.memberDept.repository;

import com.fourfree.intranet.memberDept.dto.MemberDeptEntityDto;
import com.fourfree.intranet.memberDept.dto.MemberDeptDto;
import com.fourfree.intranet.memberDept.entity.MemberDept;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
@Transactional
class MemberDeptRepositoryTest {

    @Autowired
    MemberDeptRepository memberDeptRepository;

    /**
     * dept, member 의 pk값을 가지고 온다.
     * insert, update, delete 로직을 수행할 때 아마도 같이 변경되려면 같이 시켜줘야할 것 같다...
     */
    @Test
    void 전체조회_Pk() {
        List<MemberDeptDto> memberDeptDtos = memberDeptRepository.findAll().stream()
                .map(
                        m -> MemberDeptDto.builder()
                                .memberDept(m)
                                .build()
                )
                .collect(Collectors.toList());

        System.out.println("memberDeptDtos = " + memberDeptDtos);
    }

    /**
     * 전체조회 결과 fk가 없어서 join 쿼리를 날리지 않아 dept, member 데이터가 null 이다. 사용 안하고 querydsl로 처리하는 쪽으로 가야함.
     */
    @Test
    void 전체조회_Entity() {
        List<MemberDept> memberDepts = memberDeptRepository.findAll();
        System.out.println("memberDepts = " + memberDepts);     // dept, member null
        List<MemberDeptEntityDto> memberDeptEntityDtos = memberDeptRepository.findAll().stream()
                .map(
                        m -> MemberDeptEntityDto.builder()
                                .memberDept(m)
                                .build()
                )
                .collect(Collectors.toList());

        System.out.println("memberDeptEntityDtos = " + memberDeptEntityDtos);       // dept, member null
    }
}
