package kr.scalar.api.seat.domain;

import lombok.Data;

import java.time.LocalDate;
@Data
public class SeatDto {
    private long seatId;
    private String seatName;
    private LocalDate reserveDay;
    private String reserveTime;
    private boolean reserved;
}
