package kr.scalar.api.seat.domain;

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
@Table(name = "seats")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private long seatId;
    @Column private String seatName;
    @Column private LocalDate reserveDay;
    @Column private String reserveTime;
    @Column private boolean reserved;
}
