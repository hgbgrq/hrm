package com.example.hrm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_AUTH_USER")
public class AuthUser {

    @Id
    private String authUserId;
    @Column
    private String authId;
    @Column
    private String userId;

}
