package com.fourfree.new_efarm.intranet.member_role.service.impl;

import com.fourfree.new_efarm.intranet.member_role.entity.MemberRole;
import com.fourfree.new_efarm.intranet.member_role.repository.MemberRoleRepository;
import com.fourfree.new_efarm.intranet.member_role.service.MemberRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberRoleServiceImpl implements MemberRoleService {

    private final MemberRoleRepository memberRoleRepository;


    @Override
    public Optional<MemberRole> selectOne(MemberRole memberRole) {
        MemberRole findByMemberRole = memberRoleRepository.findByMbId(memberRole.getMbId());
        return Optional.ofNullable(findByMemberRole);
    }

    @Override
    public List<MemberRole> selectAll() {
        return memberRoleRepository.findAll();
    }

    @Override
    @Transactional
    public Long update(MemberRole memberRole) {
        Optional<MemberRole> findByMemberRole = this.selectOne(memberRole);

        return findByMemberRole.get().getMroNo();
    }

    @Override
    @Transactional
    public void save(MemberRole memberRole) {
        memberRoleRepository.save(memberRole);
    }

    @Override
    @Transactional
    public void delete(MemberRole memberRole) {
        memberRoleRepository.delete(memberRole);
    }
}
