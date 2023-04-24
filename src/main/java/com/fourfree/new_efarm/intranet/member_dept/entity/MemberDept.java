package com.fourfree.new_efarm.intranet.member_dept.entity;

import com.fourfree.new_efarm.intranet.dept.entity.Dept;
import com.fourfree.new_efarm.intranet.member.entity.Member;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@Table(name = "tb_member_dept")
public class MemberDept {
    // pk
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mdNo;

    // dept pk
    private Long dpNo;

    // member pk
    private Long mbNo;

    // 사용자 아이디
    private String mbId;

    // 구)전산_사원번호
    private String mdEmpCode;

    // 임시사원번호
    private String mdTempEmpCode;

    // 영업사원 - 전산
    private String mdApname;

    // 담당업무
    private String mdBusiness;

    // 직급코드
    private String mdPositionCode;

    // 부서장여부
    private Integer mdIsdj;

    // 팀장여부
    private Integer mdIstj;

    // 겸직여부 0-normal 1-겸직
    private Integer mdIsva;

    // 순서
    private Integer mdSeq;

    // 전화기 사용여부
    private Integer mdIscall;

    // 수정 시간
    private LocalDateTime mdUpdatedt;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "dpNo")
    private Dept dept;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "mbNo")
    private Member member;


}
