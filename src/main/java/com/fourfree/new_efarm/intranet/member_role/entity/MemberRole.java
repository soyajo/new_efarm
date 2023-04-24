package com.fourfree.new_efarm.intranet.member_role.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tb_member_role")
public class MemberRole {
    // pk
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mroNo;

    // 멤버 아이디
    private String mbId;

    // 권한 아이디
    private String roId;

    // 권한 이름
    private String roName;

    // 등록자 아아디
    private String mroRegMbId;

    // 등록일
    private String mroRegDate;

    // 수정자 아이디
    private String mroUdtMbId;

    // 수정일
    private String mroUdtDate;
}
