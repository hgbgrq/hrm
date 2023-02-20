package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_AUTH_MENU")
public class AuthMenu extends CommonEntity {

    @Id
    private String authMenuId;

    private String authId;

    private String menuId;

}
