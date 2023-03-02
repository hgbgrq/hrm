package com.example.hrm.user.model.res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class UserRes {

    @Schema(name = "사용자 아이디")
    private String userId;

    @Schema(name = "사용자 이름")
    private String userFirstName;

    @Schema(name = "사용자 성")
    private String userLastName;

    @Schema(name = "사용자 남은 휴가")
    private Float remainVacation;

    @Schema(name = "사용자 상태 이름")
    private String statusName;

    @Schema(name = "사용자 조직 이름")
    private String orgName;

    @Schema(name = "사용자 직급")
    private String positionName;

}
