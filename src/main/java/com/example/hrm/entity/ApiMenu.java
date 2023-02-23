package com.example.hrm.entity;

import com.example.hrm.common.dto.CommonEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_API_MENU")
public class ApiMenu extends CommonEntity {

    @Id
    private String apiMenuId;
    @Column
    private String apiId;
    @Column
    private String menuId;

}
