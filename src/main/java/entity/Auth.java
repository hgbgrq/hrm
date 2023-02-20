package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_AUTH")
public class Auth extends CommonEntity {

    @Id
    private String authId;

    private String authName;


}
