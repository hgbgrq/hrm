package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cost {

    @Id
    private String CostUuid;

    private String costOvertimeUuid;

    private String costCode;

    private String costValue;
}
