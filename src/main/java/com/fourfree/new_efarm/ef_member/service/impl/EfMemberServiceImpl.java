package com.fourfree.new_efarm.ef_member.service.impl;

import com.fourfree.new_efarm.ef_member.dto.EfMemberDto;
import com.fourfree.new_efarm.ef_member.service.EfMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class EfMemberServiceImpl implements EfMemberService {
    @Override
    public List<EfMemberDto> selectAll() {

        return null;
    }

    @Override
    public EfMemberDto selectOne() {
        return null;
    }
}
