package com.example.hrm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_APPROVAL_DETAIL")
public class ApprovalDetail {
    @Id
    private String approvalDetailUuid;
    @Column
    private String approvalMasterUuid;
    @Column
    private String approvalDetailAuth;
    @Column
    private String approvalDetailStatusCode;
    @Column
    private String approvalDetailDescription;
    @Column
    private String approvalDetailSort;

}
