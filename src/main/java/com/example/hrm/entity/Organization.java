package com.example.hrm.entity;

import com.example.hrm.common.dto.CommonEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_ORGANIZATION")
public class Organization extends CommonEntity  {
    @Id
    private String organizationUuid;
    @Column
    private String organizationUpperUuid;
    @Column
    private String organizationName;
    @Column
    private String organizationDescription;

}
