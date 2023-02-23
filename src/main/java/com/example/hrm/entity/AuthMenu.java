package com.example.hrm.entity;

import com.example.hrm.common.dto.CommonEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_AUTH_MENU")
public class AuthMenu extends CommonEntity {

    @Id
    private String authMenuId;
    @Column
    private String authId;
    @Column
    private String menuId;

}
