package com.fourfree.new_efarm.intranet.member.repository;

import com.fourfree.new_efarm.intranet.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom, QuerydslPredicateExecutor<Member> {

    Member findByMbId(String mbId);

    void deleteByMbId(String mbId);

}
