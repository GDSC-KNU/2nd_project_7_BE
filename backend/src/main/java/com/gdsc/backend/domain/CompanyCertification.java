package com.gdsc.backend.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CompanyCertification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 1씩 증가
    @Column(name = "CompanyCertificationID", updatable = false)
    private Long CompanyCertificationID;
    @ManyToOne
    @JoinColumn(name = "CompanyID", nullable = false)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "CertificationID", nullable = false)
    private Certification certification;
}
