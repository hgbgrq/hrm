package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_ROLE_USER")
public class RoleUser extends CommonEntity {

    @Id
    private String roleUserId;

    private String roleId;

    private String userId;

}
