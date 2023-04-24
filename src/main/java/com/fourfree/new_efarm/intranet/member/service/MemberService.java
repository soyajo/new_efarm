package com.fourfree.new_efarm.intranet.member.service;


import com.fourfree.new_efarm.intranet.member.entity.Member;

import java.util.List;
import java.util.Optional;

public interface MemberService {

    Optional<Member> selectOneMbId(String mbId);

    List<Member> selectAll();

    Long update(Member member);

    void insert(Member member);

    void deleteByMbId(String mbId);

    void delete(Member member);
}
