package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_USER")
public class User extends CommonEntity {
    @Id
    private String userId;

    private String orgId;

    private String positionCode;

    private String joinDate;

    private String phoneNumber;

    private String userName;

    private String password;

}
