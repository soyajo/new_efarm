package com.fourfree.intranet.member_dept.repository;


import com.fourfree.intranet.member_dept.dto.MemberDeptJoinDeptDto;
import com.fourfree.intranet.member_dept.dto.MemberDeptJoinDeptSearchCondition;

import java.util.List;

public interface MemberDeptRepositoryCustom {

    MemberDeptJoinDeptDto selectOneJoinMbId(
            MemberDeptJoinDeptSearchCondition condition
    );
}
