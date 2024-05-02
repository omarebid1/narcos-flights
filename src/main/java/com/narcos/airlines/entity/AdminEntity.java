package com.narcos.airlines.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "admin")
@Data
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class AdminEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private Integer adminId;

    @Column(name = "username")
    private String adminUsername;

    @Column(name = "password")
    private String adminPassword;

    @Column(name = "name")
    private String adminName;

    @Column(name = "email")
    private String adminEmail;

    @Column(name = "phone_number")
    private String adminPhone;

}
