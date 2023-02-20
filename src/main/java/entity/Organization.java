package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_ORGANIZATION")
public class Organization extends CommonEntity  {
    @Id
    private String organizationUuid;

    private String organizationUpperUuid;

    private String organizationName;

    private String organizationDescription;

}
