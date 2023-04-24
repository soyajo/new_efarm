package com.fourfree.new_efarm.intranet.member.service.impl;

import com.fourfree.new_efarm.intranet.dept.entity.Dept;
import com.fourfree.new_efarm.intranet.dept.service.DeptService;
import com.fourfree.new_efarm.intranet.member.entity.Member;
import com.fourfree.new_efarm.intranet.member.repository.MemberRepository;
import com.fourfree.new_efarm.intranet.member.service.MemberService;
import com.fourfree.new_efarm.intranet.member_dept.entity.MemberDept;
import com.fourfree.new_efarm.intranet.member_dept.repository.MemberDeptRepository;
import com.fourfree.new_efarm.intranet.member_role.entity.MemberRole;
import com.fourfree.new_efarm.intranet.member_role.repository.MemberRoleRepository;
import com.fourfree.new_efarm.intranet.role.entity.Role;
import com.fourfree.new_efarm.intranet.role.repository.RoleRepository;
import com.fourfree.new_efarm.intranet.role.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Optional<Member> selectOneMbId(String mbId) {
        Member member = memberRepository.findByMbId(mbId);
        return Optional.ofNullable(member);
    }

    @Override
    public List<Member> selectAll() {
        return memberRepository.findAll();
    }

    @Override
    @Transactional
    public Long update(Member member) {
        Member findMember = this.selectOneMbId(member.getMbId()).get();

        if (findMember != null) {
            findMember.setMbName(member.getMbName());
            return findMember.getMbNo();
        }else {
            throw new RuntimeException("변경 오류(findMember null)");
        }
    }

    @Override
    @Transactional
    public void insert(Member member) {
        memberRepository.save(member);
    }

    @Override
    @Transactional
    public void deleteByMbId(String mbId) {
        memberRepository.deleteByMbId(mbId);
    }

    @Override
    public void delete(Member member) {
        memberRepository.delete(member);
    }
}
