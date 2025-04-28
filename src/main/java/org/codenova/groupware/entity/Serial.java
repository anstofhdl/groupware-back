package org.codenova.groupware.entity;

import jakarta.persistence.*;

@Entity
// @Table(name="serial") //엔티티명과 테이블 명이 일치하면 생략
public class Serial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // 컬럼명과 필드명이 일치하면 생략
    private  Integer id;

    private String ref;

    private long lastNumber;
}
