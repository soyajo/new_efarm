package com.fourfree.new_efarm.intranet.member.entity;



import com.fourfree.new_efarm.common.Entity.BaseEntity;
import com.fourfree.new_efarm.intranet.member_dept.entity.MemberDept;
import com.fourfree.new_efarm.intranet.role.entity.Role;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_member")
public class Member extends BaseEntity {

    // pk
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
    private String mbRegdate;

    // 모바일 인증여부
    @Column(name = "mb_auth_mobile")
    private Integer mb_AuthMobile;

    // 상태
    @Column(name = "mb_use")
    private Integer mbUse;

    // 마지막 로그인일자
    @Column(name = "mb_lastlogin_date")
    private LocalDate mbLastloginDate;

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
    @Column(name = "mb_reg_date")
    private LocalDate mbReqDate;

    // 직원_입사일자
    private String idate;

    // 직원 퇴사일자
    private String tdate;

    // 비밀번호 만료일
    @Column(name = "mb_passwd_limi")
    private String mbPasswdLimi;

    // 직원 등록일
    @Column(name = "mb_proc_date")
    private LocalDate mbProcDate;

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

    // work-type :: 근무 형태 :: FE-정직, SE-용역, CE-사업자
    @Enumerated(EnumType.STRING)
    @Column(name = "mb_wtype")
    private MemberWorkType mbWtype;

    public void setMbName(String mbName) {
        this.mbName = mbName;
    }



}
