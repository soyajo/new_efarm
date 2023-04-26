package com.fourfree.new_efarm.ef_member.entity;

import com.fourfree.intranet.member.entity.MemberSex;
import com.fourfree.intranet.member.entity.MemberWorkType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "tb_member")
public class EfMember {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mb_no")
    private Long mbNo;

    // 아이디
    @Column(name = "mb_id")
    private String mbId;

    // 이름
    @Column(name = "mb_name")
    private String mbName;

    // 주민등록번호
    @Column(name = "mb_jumin")
    private String mbJumin;

    // 비번
    @Column(name = "mb_passwd")
    private String mbPasswd;

    // 생일
    @Column(name = "mb_birth")
    private String mbBirth;

    // 전화번호
    @Column(name = "mb_tel")
    private String mbTel;

    // 휴대폰번호
    @Column(name = "mb_hp")
    private String mbHp;

    // 이메일
    @Column(name = "mb_email")
    private String mbEmail;

    // 우편번호
    @Column(name = "mb_zip")
    private String mbZip;

    // 주소1
    @Column(name = "mb_addr1")
    private String mbAddr1;

    // 주소2
    @Column(name = "mb_addr2")
    private String mbAddr2;

    // 구주소1
    @Column(name = "mb_oldaddr1")
    private String mbOldaddr1;

    // 구주소2
    @Column(name = "mb_oldaddr2")
    private String mbOldaddr2;

    // 사진
    @Column(name = "mb_image")
    private String mbImage;

    // 직원가입일
    @Column(name = "mb_regdate")
    private LocalDateTime mbRegdate;

    // 모바일 인증여부
    @Column(name = "mb_auth_mobile")
    private Integer mbAuthMobile;

    // 상태
    @Column(name = "mb_use")
    private Integer mbUse;

    // 비밀번호 초기화 여부
    @Column(name = "mb_passwd_init")
    private Integer mbPasswdInit;

    // 마지막 수정일
    @Column(name = "mb_udt_date")
    private LocalDateTime mbUdtDate;

    // 마지막 수정자
    @Column(name = "mb_udt_id")
    private String mbUtdId;

    // 마지막 로그인일자
    @Column(name = "mb_lastlogin_date")
    private LocalDateTime mbLastloginDate;

    // 상태 - 재직 : 1, 휴직 : , 퇴직 : 9
    @Column(name = "mb_status")
    private Integer mbStatus;

    // 직원등록자_아이디
    @Column(name = "mb_reg_id")
    private String mbRegId;

    // 등록진행 상태 - 상태 : 0, 완료 : 1
    @Column(name = "mb_reg_status")
    private Integer mbRegStatus;

    // 직원등록_신청일자
    @Column(name = "mb_req_date")
    private LocalDateTime mbReqDate;

    // 직원_입사일자
    @Column(name = "mb_idate")
    private String mbIdate;

    // 직원 퇴사일자
    @Column(name = "mb_tdate")
    private String mbTdate;

    // 비밀번호 만료일
    @Column(name = "mb_passwd_limitdate")
    private String mbPasswdLimitdate;

    // 직원 등록일
    @Column(name = "mb_proc_date")
    private LocalDateTime mbProcDate;

    // 삭제여부
    @Column(name = "mb_isdel")
    private Integer mbIsdel;

    // 내선번호
    @Column(name = "p_intra_num")
    private String pIntraNum;

    // 성별(M-남성, F-여성)
    @Enumerated(EnumType.STRING)
    @Column(name = "mb_sex")
    private MemberSex mbSex;

    // 나이
    @Column(name = "mb_age")
    private Integer mbAge;

    // 재직기간
    @Column(name = "mb_doday")
    private Integer mbDoday;


    @Builder
    public EfMember(Long mbNo, String mbId, String mbName, String mbJumin, String mbPasswd, String mbBirth, String mbTel, String mbHp, String mbEmail, String mbZip, String mbAddr1, String mbAddr2, String mbOldaddr1, String mbOldaddr2, String mbImage, LocalDateTime mbRegdate, Integer mbAuthMobile,
                  Integer mbUse, Integer mbPasswdInit, LocalDateTime mbUdtDate, String mbUtdId, LocalDateTime mbLastloginDate, Integer mbStatus, String mbRegId, Integer mbRegStatus, LocalDateTime mbReqDate, String mbIdate, String mbTdate, String mbPasswdLimitdate, LocalDateTime mbProcDate, Integer mbIsdel, String pIntraNum, MemberSex mbSex, Integer mbAge, Integer mbDoday) {
        this.mbNo = mbNo;
        this.mbId = mbId;
        this.mbName = mbName;
        this.mbJumin = mbJumin;
        this.mbPasswd = mbPasswd;
        this.mbBirth = mbBirth;
        this.mbTel = mbTel;
        this.mbHp = mbHp;
        this.mbEmail = mbEmail;
        this.mbZip = mbZip;
        this.mbAddr1 = mbAddr1;
        this.mbAddr2 = mbAddr2;
        this.mbOldaddr1 = mbOldaddr1;
        this.mbOldaddr2 = mbOldaddr2;
        this.mbImage = mbImage;
        this.mbRegdate = mbRegdate;
        this.mbAuthMobile = mbAuthMobile;
        this.mbUse = mbUse;
        this.mbPasswdInit = mbPasswdInit;
        this.mbUdtDate = mbUdtDate;
        this.mbUtdId = mbUtdId;
        this.mbLastloginDate = mbLastloginDate;
        this.mbStatus = mbStatus;
        this.mbRegId = mbRegId;
        this.mbRegStatus = mbRegStatus;
        this.mbReqDate = mbReqDate;
        this.mbIdate = mbIdate;
        this.mbTdate = mbTdate;
        this.mbPasswdLimitdate = mbPasswdLimitdate;
        this.mbProcDate = mbProcDate;
        this.mbIsdel = mbIsdel;
        this.pIntraNum = pIntraNum;
        this.mbSex = mbSex;
        this.mbAge = mbAge;
        this.mbDoday = mbDoday;
    }
}
