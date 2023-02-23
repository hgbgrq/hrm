package com.example.hrm.entity;

import com.example.hrm.common.dto.CommonEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_COST")
public class Cost extends CommonEntity {

    @Id
    private String CostUuid;
    @Column
    private String costOvertimeUuid;
    @Column
    private String costCode;
    @Column
    private String costValue;
}
