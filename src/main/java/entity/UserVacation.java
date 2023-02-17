package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserVacation extends CommonEntity {

    @Id
    private String userVacationUuid;

    private String userId;

    private String userVacationCode;

    private String userVacationTotalCount;

    private String userVacationRemainCount;

    private String expireDate;

    private String userVacationDescription;

}
