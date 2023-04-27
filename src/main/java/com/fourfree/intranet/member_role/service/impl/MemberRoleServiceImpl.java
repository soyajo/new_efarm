package com.fourfree.intranet.member_role.service.impl;

import com.fourfree.intranet.member_role.dto.MemberRoleDto;
import com.fourfree.intranet.member_role.repository.MemberRoleRepository;
import com.fourfree.intranet.member_role.service.MemberRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberRoleServiceImpl implements MemberRoleService {

    private final MemberRoleRepository memberRoleRepository;

    @Override
    public List<MemberRoleDto> selectAllMbId(String mbId) {
        return memberRoleRepository.findByMbId("juyeon").stream()
                .map(
                        m -> MemberRoleDto.builder()
                                .memberRole(m)
                                .build()
                )
                .collect(Collectors.toList());
    }
}
