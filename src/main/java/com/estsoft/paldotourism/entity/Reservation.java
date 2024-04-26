package com.estsoft.paldotourism.entity;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // 예약 아이디(PK)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private User user; // 유저 정보(FK)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Bus bus; // 버스 정보(FK)

    @Column
    private String reservationNumber; // 예약 번호

}