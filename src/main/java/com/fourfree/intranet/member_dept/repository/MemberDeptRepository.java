package com.fourfree.intranet.member_dept.repository;

import com.fourfree.intranet.member_dept.entity.MemberDept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDeptRepository extends JpaRepository<MemberDept, Long>, QuerydslPredicateExecutor<MemberDept>, MemberDeptRepositoryCustom  {


}
