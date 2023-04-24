package com.fourfree.new_efarm.intranet.member_role.service.impl;

import com.fourfree.new_efarm.intranet.member_role.repository.MemberRoleRepository;
import com.fourfree.new_efarm.intranet.member_role.service.MemberRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberRoleServiceImpl implements MemberRoleService {

    private final MemberRoleRepository memberRoleRepository;

}
