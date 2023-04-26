package com.fourfree.common.Entity;

import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
public class BaseEntity extends BaseTimeEntity {

    // 등록자아이디
    @Column(name = "reg_id")
    private String regId;

    // 마지막수정자아이디
    @Column(name = "update_id")
    private String updateId;

}
