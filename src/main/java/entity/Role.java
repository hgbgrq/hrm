package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_ROLE")
public class Role extends CommonEntity {

    @Id
    private String roleId;

    private String roleName;

}
