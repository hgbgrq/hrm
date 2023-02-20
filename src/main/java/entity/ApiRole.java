package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_API_ROLE")
public class ApiRole extends CommonEntity {

    @Id
    private String apiRoleId;

    private String apiId;

    private String roleId;


}
