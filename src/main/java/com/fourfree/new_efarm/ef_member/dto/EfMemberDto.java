package com.fourfree.new_efarm.ef_member.dto;


import com.fourfree.intranet.member.entity.Member;
import com.fourfree.intranet.member.entity.MemberSex;
import com.fourfree.new_efarm.ef_member.entity.EfMember;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class EfMemberDto {
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

    // Entity to Dto
    @Builder
    public EfMemberDto(EfMember efMember) {
        this.mbNo = efMember.getMbNo();
        this.mbId = efMember.getMbId();
        this.mbName = efMember.getMbName();
        this.mbJumin = efMember.getMbJumin();
        this.mbPasswd = efMember.getMbPasswd();
        this.mbBirth = efMember.getMbBirth();
        this.mbTel = efMember.getMbTel();
        this.mbHp = efMember.getMbHp();
        this.mbEmail = efMember.getMbEmail();
        this.mbZip = efMember.getMbZip();
        this.mbAddr1 = efMember.getMbAddr1();
        this.mbAddr2 = efMember.getMbAddr2();
        this.mbOldaddr1 = efMember.getMbOldaddr1();
        this.mbOldaddr2 = efMember.getMbOldaddr2();
        this.mbImage = efMember.getMbImage();
        this.mbRegdate = efMember.getMbRegdate();
        this.mbAuthMobile = efMember.getMbAuthMobile();
        this.mbUse = efMember.getMbUse();
        this.mbPasswdInit = efMember.getMbPasswdInit();
        this.mbUdtDate = efMember.getMbUdtDate();
        this.mbUtdId = efMember.getMbUtdId();
        this.mbLastloginDate = efMember.getMbLastloginDate();
        this.mbStatus = efMember.getMbStatus();
        this.mbRegId = efMember.getMbRegId();
        this.mbRegStatus = efMember.getMbRegStatus();
        this.mbReqDate = efMember.getMbReqDate();
        this.mbIdate = efMember.getMbIdate();
        this.mbTdate = efMember.getMbTdate();
        this.mbPasswdLimitdate = efMember.getMbPasswdLimitdate();
        this.mbProcDate = efMember.getMbProcDate();
        this.mbIsdel = efMember.getMbIsdel();
        this.pIntraNum = efMember.getPIntraNum();
        this.mbSex = efMember.getMbSex();
        this.mbAge = efMember.getMbAge();
        this.mbDoday = efMember.getMbDoday();
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
                .build();
    }
}
