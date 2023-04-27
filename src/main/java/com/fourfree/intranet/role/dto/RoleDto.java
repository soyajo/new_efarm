package com.fourfree.intranet.role.dto;

import com.fourfree.intranet.role.entity.Role;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RoleDto {

    // pk
    private Long roNo;
    // role 아이디
    private String roId;
    // 이름
    private String roName;
    // 설명
    private String roDesc;
    // 사용여부
    private Integer roIsuse;
    // 순서
    private Integer roSeq;

    // entity to dto
    @Builder
    public RoleDto(
            Role role
    ) {
        this.roNo = role.getRoNo();
        this.roId = role.getRoId();
        this.roName = role.getRoName();
        this.roDesc = role.getRoDesc();
        this.roIsuse = role.getRoIsuse();
        this.roSeq = role.getRoSeq();
    }

    // dto to entity
    public Role toEntity() {
        return Role.builder()
                .roNo(roNo)
                .roId(roId)
                .roName(roName)
                .roDesc(roDesc)
                .roIsuse(roIsuse)
                .roSeq(roSeq)
                .build();
    }
}
