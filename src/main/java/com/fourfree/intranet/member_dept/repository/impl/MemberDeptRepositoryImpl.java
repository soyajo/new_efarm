package com.fourfree.intranet.member_dept.repository.impl;

import com.fourfree.intranet.member_dept.dto.MemberDeptJoinDeptDto;
import com.fourfree.intranet.member_dept.dto.MemberDeptJoinDeptSearchCondition;
import com.fourfree.intranet.member_dept.dto.QMemberDeptJoinDeptDto;
import com.fourfree.intranet.member_dept.repository.MemberDeptRepositoryCustom;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.fourfree.intranet.dept.entity.QDept.dept;
import static com.fourfree.intranet.member_dept.entity.QMemberDept.memberDept;
import static org.springframework.util.StringUtils.hasText;

@RequiredArgsConstructor
public class MemberDeptRepositoryImpl implements MemberDeptRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public MemberDeptJoinDeptDto selectOneJoinMbId(
            MemberDeptJoinDeptSearchCondition condition
    ) {
        return queryFactory
                .select(new QMemberDeptJoinDeptDto(
                            memberDept,
                            dept
                ))
                .from(memberDept)
                .innerJoin(dept)
                .on(memberDept.dept.dpNo.eq(dept.dpNo))
                .where(
                        mbIdEq(condition.getMbId())
                                .and(memberDept.mdIsva.eq(0))
                )
                .fetchOne();
    }

    private BooleanExpression mbIdEq(String mbId) {
        return hasText(mbId) ? memberDept.mbId.eq(mbId) : null;
    }

}
