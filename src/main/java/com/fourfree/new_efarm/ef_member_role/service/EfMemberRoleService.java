package com.fourfree.new_efarm.ef_member_role.service;

import com.fourfree.intranet.member_role.dto.MemberRoleDto;
import com.fourfree.new_efarm.ef_member_role.dto.EfMemberRoleDto;

import java.util.List;

public interface EfMemberRoleService {

    List<EfMemberRoleDto> selectAllMbId(String mbId);
}
