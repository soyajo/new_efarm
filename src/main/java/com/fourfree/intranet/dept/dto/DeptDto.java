package com.fourfree.intranet.dept.dto;

import com.fourfree.intranet.dept.entity.Dept;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DeptDto {



    private Long dpNo;  // pk
    private Long dpPno; // 상위 pk
    private String dpName;  // 부서명
    private String dpName2; // 부서명2
    private Integer dpSeq;  // 순서
    private String dpDescription;   // 설명
    private Integer dpIsuse;    // 사용여부
    private Integer dpIsdel;    // 삭제여부
    private LocalDateTime dpRegdt;  //등록일
    private String dpRegid; //등록자
    private LocalDateTime dpLastmodifydt;   // 수정일
    private String dpLastmodifyid;  // 수정자
    private String dpColor; // 색상
    private Integer dpLevel;    // 레벨
    private String dpPath;  //경로-검색용 경로

    @Builder
    public DeptDto(
            Dept dept
    ) {
        this.dpNo = dept.getDpNo();
        this.dpPno = dept.getDpPno();
        this.dpName = dept.getDpName();
        this.dpName2 = dept.getDpName2();
        this.dpSeq = dept.getDpSeq();
        this.dpDescription = dept.getDpDescription();
        this.dpIsuse = dept.getDpIsuse();
        this.dpIsdel = dept.getDpIsdel();
        this.dpRegdt = dept.getDpRegdt();
        this.dpRegid = dept.getDpRegid();
        this.dpLastmodifydt = dept.getDpLastmodifydt();
        this.dpLastmodifyid = dept.getDpLastmodifyid();
        this.dpColor = dept.getDpColor();
        this.dpLevel = dept.getDpLevel();
        this.dpPath = dept.getDpPath();
    }

    public Dept toEntity() {
        return Dept.builder()
                .dpNo(dpNo)
                .dpPno(dpPno)
                .dpName(dpName)
                .dpName2(dpName2)
                .dpSeq(dpSeq)
                .dpDescription(dpDescription)
                .dpIsuse(dpIsuse)
                .dpIsdel(dpIsdel)
                .dpRegdt(dpRegdt)
                .dpRegid(dpRegid)
                .dpLastmodifydt(dpLastmodifydt)
                .dpLastmodifyid(dpLastmodifyid)
                .dpColor(dpColor)
                .dpLevel(dpLevel)
                .dpPath(dpPath)
                .build();
    }
}
