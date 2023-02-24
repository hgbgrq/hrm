package com.example.hrm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_AUTH_MENU")
public class AuthMenu {

    @Id
    private String authMenuId;
    @Column
    private String authId;
    @Column
    private String menuId;

}
