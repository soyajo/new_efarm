package com.fourfree.new_efarm.intranet.member_dept.repository;

import com.fourfree.new_efarm.intranet.member_dept.entity.MemberDept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDeptRepository extends JpaRepository<MemberDept, Long> {
    MemberDept findByMbId(String mbId);

}
