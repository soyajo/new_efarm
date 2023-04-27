package com.fourfree.new_efarm.ef_member.repository;

import com.fourfree.new_efarm.ef_member.entity.EfMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EfMemberRepository extends JpaRepository<EfMember, Long> {

    Optional<EfMember> findByMbId(String mbId);
}
