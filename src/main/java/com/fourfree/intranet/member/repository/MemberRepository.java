package com.fourfree.intranet.member.repository;

import com.fourfree.intranet.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByMbId(String mbId);
}
