package com.fourfree.new_efarm.intranet.member.repository;

import com.fourfree.new_efarm.intranet.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Long, Member> {

    Member findByMbId(String s);

}
