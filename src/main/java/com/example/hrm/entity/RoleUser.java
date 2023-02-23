package com.example.hrm.entity;

import com.example.hrm.common.dto.CommonEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_ROLE_USER")
public class RoleUser extends CommonEntity {

    @Id
    private String roleUserId;
    @Column
    private String roleId;
    @Column
    private String userId;

}
