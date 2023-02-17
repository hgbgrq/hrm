package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Organization extends CommonEntity  {
    @Id
    private String organizationUuid;

    private String organizationUpperUuid;

    private String organizationName;

    private String organizationDescription;

}
