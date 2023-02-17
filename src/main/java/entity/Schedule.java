package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Schedule extends CommonEntity {

    @Id
    private String scheduleUuid;

    private String scheduleName;

    private String scheduleCode;

    private String scheduleDescription;

    private String startDate;

    private String endDate;

}
