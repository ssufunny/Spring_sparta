package com.sparta.week04.domain;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter // get 함수 자동 생성
@MappedSuperclass   // 멤버 변수가 컬럼이 되도록 함
@EntityListeners(AuditingEntityListener.class)  // 변경시 자동 기록
public class Timestamped {
    @CreatedDate    // 최초 생성 시점
    private LocalDateTime createdAt;

    @LastModifiedDate   // 마지막 변경 시점
    private LocalDateTime modifiedAt;
}
