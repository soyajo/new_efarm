package com.fourfree.new_efarm.ef_member.service;


import com.fourfree.new_efarm.ef_member.dto.EfMemberDto;

import java.util.List;

public interface EfMemberService {
    List<EfMemberDto> selectAll();

    EfMemberDto selectOne();
}
