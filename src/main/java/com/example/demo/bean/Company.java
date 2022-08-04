package com.example.demo.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "company")
public class Company {

    @Column(nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Date createTime;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    private Set<Employee> employees;
}
