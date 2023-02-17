package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ApprovalMaster {

    @Id
    private String approvalMasterUuid;

    private String approvalMasterCode;

    private String approvalMasterStatusCode;

    private String approvalMasterDescription;

}
