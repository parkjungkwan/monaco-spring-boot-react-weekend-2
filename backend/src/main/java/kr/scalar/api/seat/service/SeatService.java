package kr.scalar.api.seat.service;

import kr.scalar.api.seat.domain.Seat;

import java.time.LocalDate;
import java.util.ArrayList;

public interface SeatService {
    ArrayList<Seat> getReservedSeat(String plexName, LocalDate ReserveDay);
    ArrayList<Seat> getReservedSeat(String plexName, LocalDate ReserveDay, String reserveTime);
}
