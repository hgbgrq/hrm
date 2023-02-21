package com.example.hrm.entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_MENU")
public class Menu extends CommonEntity {

    @Id
    private String menuId;
    @Column
    private String upperMenuId;
    @Column
    private String menuUrl;
    @Column
    private String menuName;


}
