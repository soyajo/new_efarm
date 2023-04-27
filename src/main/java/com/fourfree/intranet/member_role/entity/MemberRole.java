package com.fourfree.intranet.member_role.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "tb_member_role")
public class MemberRole {


    @Id @GeneratedValue
    @Column(name = "mro_no")
    private Long mroNo;
    @Column(name = "mb_id")
    private String mbId;
    @Column(name = "ro_id")
    private String roId;
    @Column(name = "mro_reg_mb_id")
    private String mroRegMbId;
    @Column(name = "mro_reg_date")
    private String mroRegDate;
    @Column(name = "mro_udt_mb_id")
    private String mroUdtMbId;
    @Column(name = "mro_udt_date")
    private String mroUdtDate;

    @Builder
    public MemberRole(
            Long mroNo,
            String mbId,
            String roId,
            String mroRegMbId,
            String mroRegDate,
            String mroUdtMbId,
            String mroUdtDate
    ) {
        this.mroNo = mroNo;
        this.mbId = mbId;
        this.roId = roId;
        this.mroRegMbId = mroRegMbId;
        this.mroRegDate = mroRegDate;
        this.mroUdtMbId = mroUdtMbId;
        this.mroUdtDate = mroUdtDate;
    }
}
