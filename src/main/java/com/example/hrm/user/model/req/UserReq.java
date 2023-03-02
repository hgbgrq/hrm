package com.example.hrm.user.model.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Data
public class UserReq {

    @Schema(description = "조직 Uuid" , example = "742b4285-6ee5-4428-8c3e-24009fdc7d8a")
    private String orgUuid;

    @Schema(description = "사용자 이름" , example = "홍길동")
    private String keyword;

    public String toStringJson() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

}
