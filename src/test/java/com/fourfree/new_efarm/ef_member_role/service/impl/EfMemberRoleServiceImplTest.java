package com.fourfree.new_efarm.ef_member_role.service.impl;

import com.fourfree.new_efarm.ef_member_role.dto.EfMemberRoleDto;
import com.fourfree.new_efarm.ef_member_role.service.EfMemberRoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class EfMemberRoleServiceImplTest {

    @Autowired
    EfMemberRoleService efMemberRoleService;

    @Test
    void 전체조회_mbId() {
        List<EfMemberRoleDto> efMemberRoleDtos = efMemberRoleService.selectAllMbId("thdi4564");
        System.out.println("efMemberRoleDtos = " + efMemberRoleDtos);
    }
}
