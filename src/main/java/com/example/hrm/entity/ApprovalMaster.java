package com.example.hrm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_APPROVAL_MASTER")
public class ApprovalMaster  {

    @Id
    private String approvalMasterUuid;
    @Column
    private String approvalMasterCode;
    @Column
    private String approvalMasterStatusCode;
    @Column
    private String approvalMasterDescription;

}
