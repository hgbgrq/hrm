package com.example.hrm.user.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Data
public class UserDto {

    private String userId;

    private String userFirstName;

    private String userLastName;

    private Float remainVacation;

    private String statusName;

    private String organizationName;

    private String positionName;

    public String toStringJson() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

}
