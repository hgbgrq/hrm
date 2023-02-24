package com.example.hrm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_VACATION")
public class Vacation {

    @Id
    private String vacationUuid;
    @Column
    private String userId;
    @Column
    private String userVacationUuid;
    @Column
    private String approvalMasterUuid;
    @Column
    private String startDate;
    @Column
    private String endDate;

}
