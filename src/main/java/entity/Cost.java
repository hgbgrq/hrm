package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_COST")
public class Cost extends CommonEntity {

    @Id
    private String CostUuid;

    private String costOvertimeUuid;

    private String costCode;

    private String costValue;
}
