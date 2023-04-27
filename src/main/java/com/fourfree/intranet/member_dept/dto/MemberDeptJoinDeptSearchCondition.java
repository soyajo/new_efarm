package com.fourfree.intranet.member_dept.dto;


import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberDeptJoinDeptSearchCondition {

    private String mbId;


    @Builder
    public MemberDeptJoinDeptSearchCondition(String mbId) {
        this.mbId = mbId;
    }
}
