package com.fourfree.intranet.member_dept.dto;

import com.fourfree.intranet.dept.entity.Dept;
import com.fourfree.intranet.member.entity.Member;
import com.fourfree.intranet.member_dept.entity.MemberDept;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 사용 안함
 * 이유) dept, member가 fk가 안잡혀서있어서 memberDept을 불러올 시 두 object는 널로 나오게 된다.
 * 그냥 querydsl join을 하는게 좋을 것 같다.
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberDeptEntityDto {
    private Long mdNo;  //pk
    private Dept dept;  //부서
    private Member member;  //직원
    private String mbId;    //직원아이디
    private String mdEmpCode;   //구) 전산 사원번호
    private String mdTempEmpCode;   //임시사원번호
    private String mdApname;    //영업사원-전산
    private String mdBusiness;  //담당업무
    private String mdPositionCode;  // 직급코드
    private Integer mdIsdj; //부서장여부
    private Integer mdIstj; //팀장여부
    private Integer mdIsva; //겸직여부(0-normal, 1-겸직)
    private Integer mdSeq;  //순서
    private Integer mdIscall;   //전화기사용여부
    private LocalDateTime mdUpdateDt;   //수정시간

    @Builder
    public MemberDeptEntityDto(
            MemberDept memberDept
    ) {
        this.mdNo = memberDept.getMdNo();
        this.dept = memberDept.getDept();
        this.member = memberDept.getMember();
        this.mbId = memberDept.getMbId();
        this.mdEmpCode = memberDept.getMdEmpCode();
        this.mdTempEmpCode = memberDept.getMdTempEmpCode();
        this.mdApname = memberDept.getMdApname();
        this.mdBusiness = memberDept.getMdBusiness();
        this.mdPositionCode = memberDept.getMdPositionCode();
        this.mdIsdj = memberDept.getMdIsdj();
        this.mdIstj = memberDept.getMdIstj();
        this.mdIsva = memberDept.getMdIsva();
        this.mdSeq = memberDept.getMdSeq();
        this.mdIscall = memberDept.getMdIscall();
        this.mdUpdateDt = memberDept.getMdUpdateDt();
    }


    public MemberDept toEntity() {
        return MemberDept.builder()
                .mdNo(mdNo)
                .dept(dept)
                .member(member)
                .mbId(mbId)
                .mdEmpCode(mdEmpCode)
                .mdTempEmpCode(mdTempEmpCode)
                .mdApname(mdApname)
                .mdBusiness(mdBusiness)
                .mdPositionCode(mdPositionCode)
                .mdIsdj(mdIsdj)
                .mdIstj(mdIstj)
                .mdIsva(mdIsva)
                .mdSeq(mdSeq)
                .mdIscall(mdIscall)
                .mdUpdateDt(mdUpdateDt)
                .build();
    }
}


