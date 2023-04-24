package com.fourfree.new_efarm.intranet.member_dept.service;

import com.fourfree.new_efarm.intranet.member_dept.entity.MemberDept;

import java.util.List;
import java.util.Optional;

public interface MemberDeptService {

    Optional<MemberDept> selectOne(MemberDept memberDept);

    List<MemberDept> seletAll();

    void insert(MemberDept memberDept);

    Long update(MemberDept memberDept);

    void delete(MemberDept memberDept);
}
