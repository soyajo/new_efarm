package com.fourfree.new_efarm.common.security;


import com.fourfree.new_efarm.intranet.member.entity.Member;
import com.fourfree.new_efarm.intranet.member.repository.MemberRepository;
import com.fourfree.new_efarm.intranet.member_role.entity.MemberRole;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. 프로젝트명 : api
 * 2. 패키지명   : com.fourfree.common.security
 * 3. 작성일     : 2020. 06. 18. 오후 5:06
 * 4. 작성자     : 고병만
 * 5. 이메일     : scormrte@gmail.com
 * 6  연락처     : 010-8299-5258
 */
@RequiredArgsConstructor
@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        List<GrantedAuthority> authorities = null;
        Member member = memberRepository.findByMbId(s);
        if (member != null) {
            List<MemberRole> memberRoles = new ArrayList<>();
            //member->role 세팅
            MemberRole memberRole = new MemberRole();
            memberRole.setRoId("ROLE_USER");
            memberRole.setRoName("일반회원");
            memberRoles.add(memberRole);
            authorities = buildUserAuthority(memberRoles);
        } else {
//            throw new BadCredentialsException("사용자가 없습니다.");
        }

        return new UserDetailImpl(member, authorities);
    }

    private List<GrantedAuthority> buildUserAuthority(List<MemberRole> roles) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (MemberRole role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getRoId()));
        }
        return authorities;
    }
}
