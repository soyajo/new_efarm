package com.fourfree.new_efarm.intranet.role.service.impl;

import com.fourfree.new_efarm.intranet.role.entity.Role;
import com.fourfree.new_efarm.intranet.role.repository.RoleRepository;
import com.fourfree.new_efarm.intranet.role.service.RoleService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor()
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

}
