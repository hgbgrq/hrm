package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_APPROVAL_DETAIL")
public class ApprovalDetail extends CommonEntity {
    @Id
    private String approvalDetailUuid;

    private String approvalMasterUuid;

    private String approvalDetailAuth;

    private String approvalDetailStatusCode;

    private String approvalDetailDescription;

    private String approvalDetailSort;

}
