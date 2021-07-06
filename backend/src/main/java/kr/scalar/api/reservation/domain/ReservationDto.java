package kr.scalar.api.reservation.domain;

import lombok.Data;

import java.time.LocalDate;
@Data
public class ReservationDto {
    private Long reserveID;
    private String theaterName;
    private String movieName;
    private String seat; //좌석위치 수정필요
    private LocalDate reserveDay;
    private String reserveTime;
    private int people;
    private int totalPrice;
    private String memberID;
}
