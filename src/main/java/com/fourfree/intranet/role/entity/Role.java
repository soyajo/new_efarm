package com.fourfree.intranet.role.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "tb_role")
public class Role {
    // pk
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ro_no")
    private Long roNo;
    // role 아이디
    @Column(name = "ro_id")
    private String roId;
    // 이름
    @Column(name = "ro_name")
    private String roName;
    // 설명
    @Column(name = "ro_desc")
    private String roDesc;
    // 사용여부
    @Column(name = "ro_isuse")
    private Integer roIsuse;
    // 순서
    @Column(name = "ro_seq")
    private Integer roSeq;


    @Builder
    public Role(
            Long roNo,
            String roId,
            String roName,
            String roDesc,
            Integer roIsuse,
            Integer roSeq
    ) {
        this.roNo = roNo;
        this.roId = roId;
        this.roName = roName;
        this.roDesc = roDesc;
        this.roIsuse = roIsuse;
        this.roSeq = roSeq;
    }



}
