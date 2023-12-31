package com.example.demo.admin.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="kh_point")
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

    @Column(length = 4)
    private Integer po_expired;

    @Column
    private Integer po_mb_point;

    @Column(length = 20)
    private String po_rel_table;

    @Column(length = 20)
    private String po_rel_id;

    @Column(length = 255)
    private String po_rel_action;

    @Column
    private String po_content;

    @Column
    @UpdateTimestamp
    private LocalDateTime po_datetime;

    @Column
    private Date po_expired_date;

}
