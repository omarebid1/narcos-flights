package com.narcos.airlines.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Table(name = "flight")
@Data
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FlightEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "flight_id")
        int id;

        @Column(name = "departure_airport")
        String departureAirPort;

        @Column(name = "arrival_airport")
        String arrivalAirPort;

        @Column(name = "departure_time")
        LocalDate departureTime;

        @Column(name = "arrival_time")
        LocalDate arrivalTime;

        @Column(name = "aircraft_type")
        String aircraftType;

        @Column(name = "pilot_id")
        int pilotId;

        @Column(name = "co_pilot_id")
        int coPilotId;

        @Column(name="status")
        String flightStatus;

}
