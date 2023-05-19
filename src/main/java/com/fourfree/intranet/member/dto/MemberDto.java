package com.fourfree.intranet.member.dto;



import com.fourfree.intranet.dept.dto.DeptDto;
import com.fourfree.intranet.member.entity.Member;
import com.fourfree.intranet.member.entity.MemberSex;
import com.fourfree.intranet.member.entity.MemberWorkType;
import com.fourfree.intranet.member_dept.dto.MemberDeptDto;
import com.fourfree.intranet.member_dept.dto.MemberDeptJoinDeptDto;
import com.fourfree.intranet.member_role.dto.MemberRoleDto;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberDto {

    // pk
    private Long mbNo;

    // 아이디
    private String mbId;

    // 이름
    private String mbName;

    // 주민등록번호
    private String mbJumin;

    // 비번
    private String mbPasswd;

    // 생일
    private String mbBirth;

    // 전화번호
    private String mbTel;

    // 휴대폰번호
    private String mbHp;

    // 이메일
    private String mbEmail;

    // 우편번호
    private String mbZip;

    // 주소1
    private String mbAddr1;

    // 주소2
    private String mbAddr2;

    // 구주소1
    private String mbOldaddr1;

    // 구주소2
    private String mbOldaddr2;

    // 사진
    private String mbImage;

    // 직원가입일
    private LocalDateTime mbRegdate;

    // 모바일 인증여부
    private Integer mbAuthMobile;

    // 상태
    private Integer mbUse;

    // 비밀번호 초기화 여부
    private Integer mbPasswdInit;

    // 마지막 수정일
    private LocalDateTime mbUdtDate;

    // 마지막 수정자
    private String mbUtdId;

    // 마지막 로그인일자
    private LocalDateTime mbLastloginDate;

    // 상태 - 재직 : 1, 휴직 : , 퇴직 : 9
    private Integer mbStatus;

    // 직원등록자_아이디
    private String mbRegId;

    // 등록진행 상태 - 상태 : 0, 완료 : 1
    private Integer mbRegStatus;

    // 직원등록_신청일자
    private LocalDateTime mbReqDate;

    // 직원_입사일자
    private String mbIdate;

    // 직원 퇴사일자
    private String mbTdate;

    //비밀번호 만료일
    private String mbPasswdLimitdate;

    // 직원 등록일
    private LocalDateTime mbProcDate;

    // 삭제여부
    private Integer mbIsdel;

    // 내선번호
    private String pIntraNum;

    // 성별(M-남성, F-여성)
    private MemberSex mbSex;

    // 나이
    private Integer mbAge;

    // 재직기간
    private Integer mbDoday;

    // work-type :: 근무 형태 :: FE-정직, SE-용역, CE-사업자
    private MemberWorkType mbWtype;

    private DeptDto dept;
    private List<String> roles;
    private List<String> farm_roles;
    private MemberDeptJoinDeptDto memberDeptJoinDeptDto;

    public void setDept(DeptDto dept) {
        this.dept = dept;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public void setFarm_roles(List<String> farm_roles) {
        this.farm_roles = farm_roles;
    }

    public void setMemberDeptJoinDeptDto(MemberDeptJoinDeptDto memberDeptJoinDeptDto) {
        this.memberDeptJoinDeptDto = memberDeptJoinDeptDto;
    }

    // entity to dto
    @Builder
    public MemberDto(Member member) {
        this.mbNo = member.getMbNo();
        this.mbId = member.getMbId();
        this.mbName = member.getMbName();
        this.mbJumin = member.getMbJumin();
        this.mbPasswd = member.getMbPasswd();
        this.mbBirth = member.getMbBirth();
        this.mbTel = member.getMbTel();
        this.mbHp = member.getMbHp();
        this.mbEmail = member.getMbEmail();
        this.mbZip = member.getMbZip();
        this.mbAddr1 = member.getMbAddr1();
        this.mbAddr2 = member.getMbAddr2();
        this.mbOldaddr1 = member.getMbOldaddr1();
        this.mbOldaddr2 = member.getMbOldaddr2();
        this.mbImage = member.getMbImage();
        this.mbRegdate = member.getMbRegdate();
        this.mbAuthMobile = member.getMbAuthMobile();
        this.mbUse = member.getMbUse();
        this.mbPasswdInit = member.getMbPasswdInit();
        this.mbUdtDate = member.getMbUdtDate();
        this.mbUtdId = member.getMbUtdId();
        this.mbLastloginDate = member.getMbLastloginDate();
        this.mbStatus = member.getMbStatus();
        this.mbRegId = member.getMbRegId();
        this.mbRegStatus = member.getMbRegStatus();
        this.mbReqDate = member.getMbReqDate();
        this.mbIdate = member.getMbIdate();
        this.mbTdate = member.getMbTdate();
        this.mbPasswdLimitdate = member.getMbPasswdLimitdate();
        this.mbProcDate = member.getMbProcDate();
        this.mbIsdel = member.getMbIsdel();
        this.pIntraNum = member.getPIntraNum();
        this.mbSex = member.getMbSex();
        this.mbAge = member.getMbAge();
        this.mbDoday = member.getMbDoday();
        this.mbWtype = member.getMbWtype();
    }

    // Dto to Entity
    public Member toEntity() {
        return Member.builder()
                .mbNo(mbNo)
                .mbId(mbId)
                .mbName(mbName)
                .mbJumin(mbJumin)
                .mbPasswd(mbPasswd)
                .mbBirth(mbBirth)
                .mbTel(mbTel)
                .mbHp(mbHp)
                .mbEmail(mbEmail)
                .mbZip(mbZip)
                .mbAddr1(mbAddr1)
                .mbAddr2(mbAddr2)
                .mbOldaddr1(mbOldaddr1)
                .mbOldaddr2(mbOldaddr2)
                .mbImage(mbImage)
                .mbRegdate(mbRegdate)
                .mbAuthMobile(mbAuthMobile)
                .mbUse(mbUse)
                .mbPasswdInit(mbPasswdInit)
                .mbUdtDate(mbUdtDate)
                .mbUtdId(mbUtdId)
                .mbLastloginDate(mbLastloginDate)
                .mbStatus(mbStatus)
                .mbRegId(mbRegId)
                .mbRegStatus(mbRegStatus)
                .mbReqDate(mbReqDate)
                .mbIdate(mbIdate)
                .mbTdate(mbTdate)
                .mbPasswdLimitdate(mbPasswdLimitdate)
                .mbProcDate(mbProcDate)
                .mbIsdel(mbIsdel)
                .pIntraNum(pIntraNum)
                .mbSex(mbSex)
                .mbAge(mbAge)
                .mbDoday(mbDoday)
                .mbWtype(mbWtype)
                .build();
    }


    // Long mbNo, String mbId, String mbName, String mbJumin, String mbPasswd, String mbBirth, String mbTel, String mbHp, String mbEmail, String mbZip, String mbAddr1, String mbAddr2, String mbOldaddr1, String mbOldaddr2, String mbImage, LocalDateTime mbRegdate, Integer mbAuthMobile,
    //                  Integer mbUse, Integer mbPasswdInit, LocalDateTime mbUdtDate, String mbUtdId, LocalDateTime mbLastloginDate, Integer mbStatus, String mbRegId, Integer mbRegStatus, LocalDateTime mbReqDate, String mbIdate, String mbTdate, String mbPasswdLimitdate, LocalDateTime mbProcDate, Integer mbIsdel, String pIntraNum, MemberSex mbSex, Integer mbAge, Integer mbDoday, MemberWorkType mbWtype
}
