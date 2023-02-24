package com.example.hrm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_COST")
public class Cost {

    @Id
    private String CostUuid;
    @Column
    private String costOvertimeUuid;
    @Column
    private String costCode;
    @Column
    private String costValue;
}
