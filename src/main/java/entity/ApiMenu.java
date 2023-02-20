package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_API_MENU")
public class ApiMenu extends CommonEntity {

    @Id
    private String apiMenuId;

    private String apiId;

    private String menuId;

}
