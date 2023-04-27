package com.fourfree.intranet.member_role.repository;

import com.fourfree.intranet.member_role.entity.MemberRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRoleRepository extends JpaRepository<MemberRole, Long> {

    List<MemberRole> findByMbId(String mbId);
}
