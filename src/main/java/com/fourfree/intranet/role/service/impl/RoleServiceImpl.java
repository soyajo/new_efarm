package com.fourfree.intranet.role.service.impl;

import com.fourfree.intranet.role.dto.RoleDto;
import com.fourfree.intranet.role.repository.RoleRepository;
import com.fourfree.intranet.role.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
}
