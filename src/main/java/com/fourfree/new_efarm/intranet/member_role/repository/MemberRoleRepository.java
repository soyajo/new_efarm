package com.fourfree.new_efarm.intranet.member_role.repository;

import com.fourfree.new_efarm.intranet.member.entity.Member;
import com.fourfree.new_efarm.intranet.member_role.entity.MemberRole;
import com.fourfree.new_efarm.intranet.role.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRoleRepository extends JpaRepository<MemberRole,Long> {

}
