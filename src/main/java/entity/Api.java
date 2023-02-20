package entity;

import com.example.hrm.common.CommonEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "TB_API")
public class Api extends CommonEntity {

    @Id
    private String apiId;

    private String apiName;

    private String apiUri;

    private String apiType;

}
