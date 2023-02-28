package com.example.hrm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_COMMON_CODE")
public class CommonCode {

    @Id
    private String commonCodeId;

    private String commonGroupCodeId;

    private String commonCodeName;

    private String commonCodeDescription;

    private String commonCodeValue;

    private String commonCodeSort;

}
