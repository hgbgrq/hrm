package com.example.hrm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_ROLE_USER")
public class RoleUser{

    @Id
    private String roleUserId;
    @Column
    private String roleId;
    @Column
    private String userId;

}
