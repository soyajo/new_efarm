package com.fourfree.intranet.member.dto;

import com.fourfree.intranet.member.entity.Member;
import com.fourfree.intranet.member.entity.MemberSex;
import com.fourfree.intranet.member.entity.MemberWorkType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
    private Integer mb_AuthMobile;

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

    // Entity to Dto
    @Builder
    public MemberDto(String mbId, String mbName) {
        this.mbId = mbId;
        this.mbName = mbName;
    }

    // Dto to Entity
//    public Member toEntity() {
//        return Member.builder()
//                .mbId(mbId)
//                .mbName(mbName)
//                .build();
//    }


}
