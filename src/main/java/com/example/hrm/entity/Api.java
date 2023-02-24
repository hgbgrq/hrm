package com.example.hrm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_API")
public class Api {

    @Id
    private String apiId;
    @Column
    private String apiName;
    @Column
    private String apiUri;
    @Column
    private String apiType;

}
