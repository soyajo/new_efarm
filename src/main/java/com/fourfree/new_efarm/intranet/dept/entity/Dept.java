package com.fourfree.new_efarm.intranet.dept.entity;

import com.fourfree.new_efarm.intranet.member_dept.entity.MemberDept;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "tb_dept")
public class Dept {
    // pk
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dp_no")
    private Long dpNo;

    // 상위 pk
    @Column(name = "dp_pno")
    private Long dpPno;

    // 부서명
    @Column(name = "dp_name")
    private String dpName;

    // 부서명2
    @Column(name = "dp_name2")
    private String dpName2;
    // 순서
    @Column(name = "dp_seq")
    private Integer dpSeq;

    // 설명
    @Column(name = "dp_description")
    private String dpDescription;

    // 사용여부
    @Column(name = "dp_isuse")
    private Integer dpIsuse;

    // 삭제여부
    @Column(name = "dp_isdel")
    private Integer dpIsdel;

    // 등록일
    @Column(name = "dp_regdt", updatable = false)
    private LocalDateTime dpRegdt;

    // 등록자아이디
    private String dpRegid;

    // 수정일
    private LocalDateTime dpLastmodifydt;

    // 수정자아이디
    private String dpLastmodifyid;

    // 색상
    @Column(name = "dp_color")
    private String dpColor;

    // 레벨
    @Column(name = "dp_level")
    private Integer dpLevel;

    // 경로-검색용 경로
    @Column(name = "dp_path")
    private String dpPath;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "dpNo")
    private MemberDept memberDept;


}
