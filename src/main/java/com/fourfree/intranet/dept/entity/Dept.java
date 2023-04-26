package com.fourfree.intranet.dept.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "tb_dept")
public class Dept {
    @Id
    @GeneratedValue
    private Long dpNo;
    private Long dpPno;
    private String dpName;
    private String dpName2;
    private Integer dpSeq;
    private String dpDescription;
    private Integer dpIsuse;
    private Integer dpIsdel;
    private LocalDateTime dpRegdt;
    private String dpRegid;
    private LocalDateTime dpLastmodifydt;
    private String dpLastmodifyid;
    private String dpColor;
    private Integer dpLevel;
    private String dpPath;


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
