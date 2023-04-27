package com.fourfree.intranet.dept.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "tb_dept")
public class Dept {
    @Id
    @GeneratedValue
    @Column(name = "dp_no")
    private Long dpNo;  // pk
    @Column(name = "dp_pno")
    private Long dpPno; // 상위 pk
    @Column(name = "dp_name")
    private String dpName;  // 부서명
    @Column(name = "dp_name2")
    private String dpName2; // 부서명2
    @Column(name = "dp_seq")
    private Integer dpSeq;  // 순서
    @Column(name = "dp_description")
    private String dpDescription;   // 설명
    @Column(name = "dp_isuse")
    private Integer dpIsuse;    // 사용여부
    @Column(name = "dp_isdel")
    private Integer dpIsdel;    // 삭제여부
    @Column(name = "dp_regdt")
    private LocalDateTime dpRegdt;  //등록일
    @Column(name = "dp_regid")
    private String dpRegid; //등록자
    @Column(name = "dp_lastmodifydt")
    private LocalDateTime dpLastmodifydt;   // 수정일
    @Column(name = "dp_lastmodifyid")
    private String dpLastmodifyid;  // 수정자
    @Column(name = "dp_color")
    private String dpColor; // 색상
    @Column(name = "dp_level")
    private Integer dpLevel;    // 레벨
    @Column(name = "dp_path")
    private String dpPath;  //경로-검색용 경로


    @Builder
    public Dept(
            Long dpNo,
            Long dpPno,
            String dpName,
            String dpName2,
            Integer dpSeq,
            String dpDescription,
            Integer dpIsuse,
            Integer dpIsdel,
            LocalDateTime dpRegdt,
            String dpRegid,
            LocalDateTime dpLastmodifydt,
            String dpLastmodifyid,
            String dpColor,
            Integer dpLevel,
            String dpPath
    ) {
        this.dpNo = dpNo;
        this.dpPno = dpPno;
        this.dpName = dpName;
        this.dpName2 = dpName2;
        this.dpSeq = dpSeq;
        this.dpDescription = dpDescription;
        this.dpIsuse = dpIsuse;
        this.dpIsdel = dpIsdel;
        this.dpRegdt = dpRegdt;
        this.dpRegid = dpRegid;
        this.dpLastmodifydt = dpLastmodifydt;
        this.dpLastmodifyid = dpLastmodifyid;
        this.dpColor = dpColor;
        this.dpLevel = dpLevel;
        this.dpPath = dpPath;
    }
}
