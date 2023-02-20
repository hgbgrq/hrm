package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_APPROVAL_MASTER")
public class ApprovalMaster extends CommonEntity {

    @Id
    private String approvalMasterUuid;

    private String approvalMasterCode;

    private String approvalMasterStatusCode;

    private String approvalMasterDescription;

}
