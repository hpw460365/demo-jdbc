package com.example.demo.bean;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private BigDecimal money;

    @Column
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "company_id", foreignKey = @ForeignKey(ConstraintMode.CONSTRAINT))
    private Company company;
}
