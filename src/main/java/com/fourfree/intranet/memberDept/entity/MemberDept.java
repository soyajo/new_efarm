package com.fourfree.intranet.memberDept.entity;

import com.fourfree.intranet.dept.entity.Dept;
import com.fourfree.intranet.member.entity.Member;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "tb_member_dept")
public class MemberDept {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "md_no")
    private Long mdNo;  //pk
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dp_no", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Dept dept;  //부서
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mb_no", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Member member;  //직원
    @Column(name = "mb_id")
    private String mbId;    //직원아이디
    @Column(name = "md_emp_code")
    private String mdEmpCode;   //구) 전산 사원번호
    @Column(name = "md_temp_emp_code")
    private String mdTempEmpCode;   //임시사원번호
    @Column(name = "md_apname")
    private String mdApname;    //영업사원-전산
    @Column(name = "md_business")
    private String mdBusiness;  //담당업무
    @Column(name = "md_position_code")
    private String mdPositionCode;  // 직급코드
    @Column(name = "md_isdj")
    private Integer mdIsdj; //부서장여부
    @Column(name = "md_istj")
    private Integer mdIstj; //팀장여부
    @Column(name = "md_isva")
    private Integer mdIsva; //겸직여부(0-normal, 1-겸직)
    @Column(name = "md_seq")
    private Integer mdSeq;  //순서
    @Column(name = "md_iscall")
    private Integer mdIscall;   //전화기사용여부
    @Column(name = "md_update_dt")
    private LocalDateTime mdUpdateDt;   //수정시간


    @Builder
    public MemberDept(
            Long mdNo,
            Dept dept,
            Member member,
            String mbId,
            String mdEmpCode,
            String mdTempEmpCode,
            String mdApname,
            String mdBusiness,
            String mdPositionCode,
            Integer mdIsdj,
            Integer mdIstj,
            Integer mdIsva,
            Integer mdSeq,
            Integer mdIscall,
            LocalDateTime mdUpdateDt
    ) {
        this.mdNo = mdNo;
        this.dept = dept;
        this.member = member;
        this.mbId = mbId;
        this.mdEmpCode = mdEmpCode;
        this.mdTempEmpCode = mdTempEmpCode;
        this.mdApname = mdApname;
        this.mdBusiness = mdBusiness;
        this.mdPositionCode = mdPositionCode;
        this.mdIsdj = mdIsdj;
        this.mdIstj = mdIstj;
        this.mdIsva = mdIsva;
        this.mdSeq = mdSeq;
        this.mdIscall = mdIscall;
        this.mdUpdateDt = mdUpdateDt;
    }
}
