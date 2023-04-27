package com.fourfree.new_efarm.ef_member_role.dto;

import com.fourfree.new_efarm.ef_member_role.entity.EfMemberRole;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EfMemberRoleDto {

    private String mroNo;
    private String mbId;
    private String roId;
    private String mroRegMbId;
    private String mroRegDate;
    private String mroUdtMbId;
    private String mroUdtDate;

    @Builder
    public EfMemberRoleDto(
            EfMemberRole efMemberRole
    ) {
        this.mroNo = efMemberRole.getMroNo();
        this.mbId = efMemberRole.getMbId();
        this.roId = efMemberRole.getRoId();
        this.mroRegMbId = efMemberRole.getMroRegMbId();
        this.mroRegDate = efMemberRole.getMroRegDate();
        this.mroUdtMbId = efMemberRole.getMroUdtMbId();
        this.mroUdtDate = efMemberRole.getMroUdtDate();
    }

    public EfMemberRole toEntity() {
        return EfMemberRole.builder()
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
