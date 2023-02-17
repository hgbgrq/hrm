package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ApprovalDetail {

    @Id
    private String approvalDetailUuid;

    private String approvalMasterUuid;

    private String approvalDetailAuth;

    private String approvalDetailStatusCode;

    private String approvalDetailDescription;

    private String approvalDetailSort;
}
