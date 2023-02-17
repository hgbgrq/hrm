package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Overtime {

    @Id
    private String overtimeUuid;

    private String userId;

    private String approvalMasterId;

    private String startDate;

    private String endDate;

    private String overtimeDescription;

}
