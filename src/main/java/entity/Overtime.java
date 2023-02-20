package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_OVERTIME")
public class Overtime extends CommonEntity {

    @Id
    private String overtimeUuid;

    private String userId;

    private String approvalMasterId;

    private String startDate;

    private String endDate;

    private String overtimeDescription;

}
