package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_AUTH_USER")
public class AuthUser extends CommonEntity {


    @Id
    private String authUserId;

    private String authId;

    private String userId;

}
