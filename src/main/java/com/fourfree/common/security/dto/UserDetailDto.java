package com.fourfree.common.security.dto;

import com.fourfree.intranet.member.dto.MemberDto;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserDetailDto implements UserDetails {

    private Long mbNo;
    private String mbId;
    private String mbName;
    private String mbPassword;
    private List<GrantedAuthority> authorities;
    private MemberDto memberDto;

    @Builder
    public UserDetailDto(MemberDto memberDto, List<GrantedAuthority> authorities) {
        this.mbNo = memberDto.getMbNo();
        this.mbId = memberDto.getMbId();
        this.mbName = memberDto.getMbName();
        this.mbPassword = memberDto.getMbPasswd();
        this.authorities = authorities;
        this.memberDto = memberDto;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.mbPassword;
    }

    @Override
    public String getUsername() {
        return this.mbId;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
