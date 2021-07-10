package kr.scalar.api.reservation.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.LocalDate;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private long reserveId;
    @Column private String theaterName;
    @Column private String movieName;
    @Column private LocalDate reserveDay;
    @Column private String reserveTime;
    @Column private int people;
    @Column private int totalPrice;
    @Column private String userId;
}
