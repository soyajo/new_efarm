package com.fourfree.common.security.service;


import com.fourfree.common.security.dto.UserDetailDto;
import com.fourfree.intranet.member.dto.MemberDto;
import com.fourfree.intranet.member.service.MemberService;
import com.fourfree.intranet.member_role.service.MemberRoleService;
import com.fourfree.new_efarm.ef_member_role.dto.EfMemberRoleDto;
import com.fourfree.new_efarm.ef_member_role.service.EfMemberRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {

    private final MemberService memberService;

    private final MemberRoleService memberRoleService;

    private final EfMemberRoleService efMemberRoleService;




    @Override
    @Transactional
    public UserDetails loadUserByUsername(String mbId) throws UsernameNotFoundException {

        MemberDto memberDto = memberService.selectOneMbId(mbId);

        List<String> roId = efMemberRoleService.selectAllMbId(mbId).stream()
                .map(EfMemberRoleDto::getRoId)
                .collect(Collectors.toList());
        memberDto.getRoles().addAll(roId);

        List<GrantedAuthority> authorities = null;

        if(memberDto != null){
            authorities = buildUserAuthority(memberDto.getRoles());
        } else {
            throw new UsernameNotFoundException(mbId + " 사용자가 없습니다.");
        }

        return UserDetailDto.builder()
                .authorities(authorities)
                .memberDto(memberDto)
                .build();
    }

    private List<GrantedAuthority> buildUserAuthority(List<String> roles) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (String role: roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        return authorities;
    }
}
