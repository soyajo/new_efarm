package com.fourfree.common.Entity;


import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
public class BaseTimeEntity  {

    // 등록일
    @CreatedDate
    @Column(name = "reg_date", updatable = false)
    private LocalDateTime regDate;

    // 마지막수정일
    @LastModifiedDate
    @Column(name="update_date")
    private LocalDateTime updateDate;
}
