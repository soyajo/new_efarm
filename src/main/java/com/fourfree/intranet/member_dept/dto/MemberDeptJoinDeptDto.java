package com.fourfree.intranet.member_dept.dto;

import com.fourfree.intranet.dept.entity.Dept;
import com.fourfree.intranet.member_dept.entity.MemberDept;
import com.querydsl.core.annotations.QueryProjection;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberDeptJoinDeptDto {
    // memberDeptDto
    private Long mdNo;  //pk
    private Long dpNo;  //부서
    private Long mbNo;  //직원
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
    private Long dpPno; // 상위 pk
    private String dpName;  // 부서명
    private String dpName2; // 부서명2
    private Integer dpSeq;  // 순서
    private String dpDescription;   // 설명
    private Integer dpIsuse;    // 사용여부
    private Integer dpIsdel;    // 삭제여부
    private LocalDateTime dpRegdt;  //등록일
    private String dpRegid; //등록자
    private LocalDateTime dpLastmodifydt;   // 수정일
    private String dpLastmodifyid;  // 수정자
    private String dpColor; // 색상
    private Integer dpLevel;    // 레벨
    private String dpPath;  //경로-검색용 경로


    @Builder
    @QueryProjection
    public MemberDeptJoinDeptDto(
            MemberDept memberDept,
            Dept dept
//            Long mdNo,
//            Long dpNo,
//            Long mbNo,
//            String mbId,
//            String mdEmpCode,
//            String mdTempEmpCode,
//            String mdApname,
//            String mdBusiness,
//            String mdPositionCode,
//            Integer mdIsdj,
//            Integer mdIstj,
//            Integer mdIsva,
//            Integer mdSeq,
//            Integer mdIscall,
//            LocalDateTime mdUpdateDt,
//            Long dpPno,
//            String dpName,
//            String dpName2,
//            Integer dpSeq,
//            String dpDescription,
//            Integer dpIsuse,
//            Integer dpIsdel,
//            LocalDateTime dpRegdt,
//            String dpRegid,
//            LocalDateTime dpLastmodifydt,
//            String dpLastmodifyid,
//            String dpColor,
//            Integer dpLevel,
//            String dpPath
    ) {
        this.mdNo = memberDept.getMdNo();
        this.dpNo = memberDept.getDept().getDpNo();
        this.mbNo = memberDept.getMember().getMbNo();
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
        this.dpPno = dept.getDpPno();
        this.dpName = dept.getDpName();
        this.dpName2 = dept.getDpName2();
        this.dpSeq = dept.getDpSeq();
        this.dpDescription = dept.getDpDescription();
        this.dpIsuse = dept.getDpIsuse();
        this.dpIsdel = dept.getDpIsdel();
        this.dpRegdt = dept.getDpRegdt();
        this.dpRegid = dept.getDpRegid();
        this.dpLastmodifydt = dept.getDpLastmodifydt();
        this.dpLastmodifyid = dept.getDpLastmodifyid();
        this.dpColor = dept.getDpColor();
        this.dpLevel = dept.getDpLevel();
        this.dpPath = dept.getDpPath();
    }


}
