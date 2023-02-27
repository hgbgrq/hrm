package com.example.hrm.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Data
@Entity
@Table(name = "TB_USER")
public class User {
    @Id
    private String userId;

    @ManyToOne(targetEntity = Organization.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "orgId")
    private Organization organization;
    @Column
    private String positionCode;
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
    @Column
    private String statusCode;

    public String toStringJson() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
