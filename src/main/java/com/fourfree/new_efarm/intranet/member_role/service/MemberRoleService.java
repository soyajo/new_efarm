package com.fourfree.new_efarm.intranet.member_role.service;

import com.fourfree.new_efarm.intranet.member_dept.entity.MemberDept;
import com.fourfree.new_efarm.intranet.member_role.entity.MemberRole;

import java.util.List;
import java.util.Optional;

public interface MemberRoleService {

    Optional<MemberRole> selectOne(MemberRole memberRole);

    List<MemberRole> selectAll();

    Long update(MemberRole memberRole);

    void save(MemberRole memberRole);

    void delete(MemberRole memberRole);

}
