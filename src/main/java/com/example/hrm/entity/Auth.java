package com.example.hrm.entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_AUTH")
public class Auth extends CommonEntity {

    @Id
    private String authId;
    @Column
    private String authName;


}
