package com.example.hrm.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

@Data
@Entity()
@Table(name = "TB_USER")
public class User {
    @Id
    private String userId;

    @ManyToOne(targetEntity = Organization.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "organizationUuid")
    private Organization organization;

    @ManyToOne(targetEntity = CommonCode.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "positionCodeId")
    private CommonCode commonCodePosition;

    @ManyToOne(targetEntity = CommonCode.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "statusCodeId")
    private CommonCode commonCodeStatus;

    @Column
    private String joinDate;
    @Column
    private String phoneNumber;
    @Column
    private String userFirstName;
    @Column
    private String userLastName;
    @Column
    private String password;

    public String toStringJson() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
