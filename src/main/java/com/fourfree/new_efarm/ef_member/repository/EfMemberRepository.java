package com.fourfree.new_efarm.ef_member.repository;

import com.fourfree.new_efarm.ef_member.entity.EfMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EfMemberRepository extends JpaRepository<EfMember, Long> {

    EfMember findByMbId(String mbId);
}
