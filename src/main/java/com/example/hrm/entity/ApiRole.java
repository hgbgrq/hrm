package com.example.hrm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_API_ROLE")
public class ApiRole {

    @Id
    private String apiRoleId;
    @Column
    private String apiId;
    @Column
    private String roleId;


}
