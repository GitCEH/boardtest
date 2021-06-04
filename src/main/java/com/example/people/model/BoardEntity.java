package com.example.people.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tblBoard")
@Getter
@NoArgsConstructor
public class BoardEntity extends TimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long seq;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String memo;

    @Column
    private Integer hit;

}
