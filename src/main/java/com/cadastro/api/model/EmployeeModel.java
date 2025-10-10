package com.cadastro.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmployee;

    private String fullName;
    private String cpf;
    private String rg;
    private LocalDate birthDate;

    private String corporateEmail;
    private String phone;
    private String address;

    private String position;
    private String department;
    private String accessLevel;
    private String employeeCode;
    private LocalDate hireDate;
    private LocalDate terminationDate;
    private String contractType;
    private Integer weeklyWorkloadHours;

    private BigDecimal baseSalary;
    private BigDecimal bonus;
    private BigDecimal transportVoucher;
    private BigDecimal mealVoucher;
    private String healthPlan;

    private Boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;






}
