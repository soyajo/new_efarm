package com.fourfree.intranet.member_dept.service;


import com.fourfree.intranet.member_dept.dto.MemberDeptJoinDeptDto;
import com.fourfree.intranet.member_dept.dto.MemberDeptJoinDeptSearchCondition;

import java.util.List;

public interface MemberDeptService {
    MemberDeptJoinDeptDto selectOneJoinMbid(MemberDeptJoinDeptSearchCondition condition);
}
