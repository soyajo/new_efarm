package com.fourfree.intranet.role.repository;

import com.fourfree.intranet.role.dto.RoleDto;
import com.fourfree.intranet.role.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
