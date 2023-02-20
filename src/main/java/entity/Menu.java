package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_MENU")
public class Menu extends CommonEntity {

    @Id
    private String menuId;

    private String upperMenuId;

    private String menuUrl;

    private String menuName;


}
