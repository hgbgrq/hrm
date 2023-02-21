package com.example.hrm.entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_USER")
public class User extends CommonEntity {
    @Id
    private String userId;
    @Column
    private String orgId;
    @Column
    private String positionCode;
    @Column
    private String joinDate;
    @Column
    private String phoneNumber;
    @Column
    private String userName;
    @Column
    private String password;

}
