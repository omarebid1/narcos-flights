package com.narcos.airlines.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "crew")
@Data
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CrewEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "crew_id")
    private Integer crewId;

    @Column(name = "name")
    private String crewFullName;

    @Column(name = "role")
    private String crewRole;

    @Column(name = "email")
    private String crewEmail;

    @Column(name = "phone_number")
    private String crewPhoneNumber;
}
