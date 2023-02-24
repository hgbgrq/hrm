package com.example.hrm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_SCHEDULE")
public class Schedule {

    @Id
    private String scheduleUuid;
    @Column
    private String scheduleName;
    @Column
    private String scheduleCode;
    @Column
    private String scheduleDescription;
    @Column
    private String startDate;
    @Column
    private String endDate;

}
