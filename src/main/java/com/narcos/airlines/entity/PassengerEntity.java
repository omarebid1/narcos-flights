package com.narcos.airlines.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "passenger")
@Data
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PassengerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passenger_id")
    private Integer passangerId;

    @Column(name = "name")
    private String passangerName;

    @Column(name = "email")
    private String passangerEmail;

    @Column(name = "phone_number")
    private String passangerPhoneNumber;


    @Column(name = "address")
    private String passangerAddress;

    @Column(name = "passport_number")
    private String passportNumber;

}
