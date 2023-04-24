package com.fourfree.new_efarm.intranet.role.entity;

import com.fourfree.new_efarm.intranet.member.entity.Member;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "tb_role")
public class Role {
    // pk
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roNo;

    // 권한 아이디
    private String roId;

    // 권한 이름
    private String roName;

    //
    private String roDesc;

    //
    private Integer roIsuse;

    //
    private Integer roSeq;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "memberId")
    private Member member;


}
