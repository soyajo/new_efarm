package com.fourfree.intranet.memberDept.entity;

import com.fourfree.intranet.member.entity.Member;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "tb_member_dept")
public class MemberDept {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mdNo;

    private Long dpNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mbId", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Member member;


}
