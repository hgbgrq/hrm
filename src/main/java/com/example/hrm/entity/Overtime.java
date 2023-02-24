package com.example.hrm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_OVERTIME")
public class Overtime {

    @Id
    private String overtimeUuid;
    @Column
    private String userId;
    @Column
    private String approvalMasterId;
    @Column
    private String startDate;
    @Column
    private String endDate;
    @Column
    private String overtimeDescription;

}
