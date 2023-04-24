package com.fourfree.new_efarm.intranet.member_dept.service.impl;

import com.fourfree.new_efarm.intranet.member_dept.entity.MemberDept;
import com.fourfree.new_efarm.intranet.member_dept.repository.MemberDeptRepository;
import com.fourfree.new_efarm.intranet.member_dept.service.MemberDeptService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberDeptServiceImpl implements MemberDeptService {
    private final MemberDeptRepository memberDeptRepository;

    @Override
    public Optional<MemberDept> selectOne(MemberDept memberDept) {
        MemberDept findMemberDept = this.memberDeptRepository.findByMbid(memberDept.getMbId());
        return Optional.ofNullable(findMemberDept);
    }

    @Override
    public List<MemberDept> seletAll() {
        return memberDeptRepository.findAll();
    }

    @Override
    @Transactional
    public void insert(MemberDept memberDept) {
        memberDeptRepository.save(memberDept);
    }

    @Override
    @Transactional
    public Long update(MemberDept memberDept) {
        Optional<MemberDept> findMemberDept = this.selectOne(memberDept);
        if (findMemberDept.isEmpty()) {
            throw new RuntimeException("수정 오류");
        }

        return findMemberDept.get().getMdNo();
    }

    @Override
    @Transactional
    public void delete(MemberDept memberDept) {
        memberDeptRepository.delete(memberDept);
    }
}
