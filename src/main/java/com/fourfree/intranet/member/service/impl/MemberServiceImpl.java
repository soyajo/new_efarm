package com.fourfree.intranet.member.service.impl;

import com.fourfree.intranet.member.service.MemberService;
import com.fourfree.intranet.member.entity.Member;
import com.fourfree.intranet.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {


}
