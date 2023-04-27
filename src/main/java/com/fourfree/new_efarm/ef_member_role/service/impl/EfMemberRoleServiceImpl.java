package com.fourfree.new_efarm.ef_member_role.service.impl;

import com.fourfree.new_efarm.ef_member_role.dto.EfMemberRoleDto;
import com.fourfree.new_efarm.ef_member_role.repository.EfMemberRoleRepository;
import com.fourfree.new_efarm.ef_member_role.service.EfMemberRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class EfMemberRoleServiceImpl implements EfMemberRoleService {

    private final EfMemberRoleRepository efMemberRoleRepository;

    @Override
    public List<EfMemberRoleDto> selectAllMbId(String mbId) {
        return efMemberRoleRepository.findAllByMbId(mbId).stream()
                .map(
                        m -> EfMemberRoleDto.builder()
                                .efMemberRole(m)
                                .build()
                )
                .collect(Collectors.toList());
    }
}
