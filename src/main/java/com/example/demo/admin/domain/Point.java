package com.example.demo.admin.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer po_id;

    @Column(length = 20)
    private String mb_id;

    @Column
    private Integer po_point;

    @Column
    private Integer po_use_point;

    @Column(length = 100)
    private String po_expired;

    @Column
    private Integer po_mb_point;

    @Column(length = 20)
    private String po_rel_table;

    @Column(length = 20)
    private String po_rel_id;


    @Column(length = 255)
    private String po_rel_action;

}
