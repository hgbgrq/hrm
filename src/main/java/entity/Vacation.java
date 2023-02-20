package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_VACATION")
public class Vacation extends CommonEntity {

    @Id
    private String vacationUuid;

    private String userId;

    private String userVacationUuid;

    private String approvalMasterUuid;

    private String startDate;

    private String endDate;

}
