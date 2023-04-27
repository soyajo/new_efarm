package com.fourfree.new_efarm.ef_member_role.repository;

import com.fourfree.new_efarm.ef_member_role.dto.EfMemberRoleDto;
import com.fourfree.new_efarm.ef_member_role.entity.EfMemberRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EfMemberRoleRepository extends JpaRepository<EfMemberRole, Long> {

     List<EfMemberRole> findAllByMbId(String mbId);
}
