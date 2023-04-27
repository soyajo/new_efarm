package com.fourfree.intranet.memberDept.repository;

import com.fourfree.intranet.memberDept.entity.MemberDept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDeptRepository extends JpaRepository<MemberDept, Long> {


}
