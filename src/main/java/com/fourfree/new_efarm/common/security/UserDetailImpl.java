package com.fourfree.new_efarm.common.security;

import com.fourfree.new_efarm.intranet.member.entity.Member;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

/**
 * 1. 프로젝트명 : api
 * 2. 패키지명   : com.fourfree.common.security
 * 3. 작성일     : 2020. 06. 22. 오전 10:04
 * 4. 작성자     : 고병만
 * 5. 이메일     : scormrte@gmail.com
 * 6  연락처     : 010-8299-5258
 */
public class UserDetailImpl implements UserDetails {

    private String mbId;
    private String mbName;
    private String mbPassword;
    private List<GrantedAuthority> authorities;
    private Member member;

    public UserDetailImpl(Member member, List<GrantedAuthority> authorities) {
        this.member = member;
        this.mbId = member.getMbId();
        this.mbName = member.getMbName();
        this.mbPassword = member.getMbPasswd();
        this.authorities = authorities;
    }

    public Member getMember() {
        return this.member;
    }


    @Override
    public List<GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public String getId() {
        return mbId;
    }

    public void setId(String id) {
        this.mbId = id;
    }

    public String getName() {
        return mbName;
    }

    public void setName(String name) {
        this.mbName = name;
    }

    @Override
    public String getPassword() {
        return mbPassword;
    }

    public void setPassword(String password) {
        this.mbPassword = password;
    }

    @Override
    public String getUsername() {
        return getId();
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

    public boolean equals(Object o) {
        if (o instanceof UserDetailImpl) {
            return mbId.equals(((UserDetailImpl) o).getUsername());
        }
        return false;
    }

    /**
     * session 로그인 중복체크 반드시 hashCode 매소드가 존재해야 구현됨
     *
     * @return
     */
    public int hashCode() {
        return mbId.hashCode();
    }
}
