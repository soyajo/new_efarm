package com.fourfree.intranet.member_role.dto;


import com.fourfree.intranet.member_role.entity.MemberRole;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberRoleDto {
    private Long mroNo;
    private String mbId;
    private String roId;
    private String mroRegMbId;
    private String mroRegDate;
    private String mroUdtMbId;
    private String mroUdtDate;


    @Builder
    public MemberRoleDto(
            MemberRole memberRole
    ) {
        this.mroNo = memberRole.getMroNo();
        this.mbId = memberRole.getMbId();
        this.roId = memberRole.getRoId();
        this.mroRegMbId = memberRole.getMroRegMbId();
        this.mroRegDate = memberRole.getMroRegDate();
        this.mroUdtMbId = memberRole.getMroUdtMbId();
        this.mroUdtDate = memberRole.getMroUdtDate();
    }

    public MemberRole toEntity() {
        return MemberRole.builder()
                .mroNo(mroNo)
                .mbId(mbId)
                .roId(roId)
                .mroRegMbId(mroRegMbId)
                .mroRegDate(mroRegDate)
                .mroUdtMbId(mroUdtMbId)
                .mroUdtDate(mroUdtDate)
                .build();
    }
}
