package com.fourfree.intranet.member_role.service;

import com.fourfree.intranet.member_role.dto.MemberRoleDto;
import com.fourfree.intranet.member_role.entity.MemberRole;

import java.util.List;

public interface MemberRoleService {
    List<MemberRoleDto> selectAllMbId(String mbId);
}
