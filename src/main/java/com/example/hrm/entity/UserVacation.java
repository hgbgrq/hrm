package com.example.hrm.entity;

import com.example.hrm.common.dto.CommonEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_USER_VACATION")
public class UserVacation extends CommonEntity {

    @Id
    private String userVacationUuid;
    @Column
    private String userId;
    @Column
    private String userVacationCode;
    @Column
    private String userVacationTotalCount;
    @Column
    private String userVacationRemainCount;
    @Column
    private String expireDate;
    @Column
    private String userVacationDescription;

}
