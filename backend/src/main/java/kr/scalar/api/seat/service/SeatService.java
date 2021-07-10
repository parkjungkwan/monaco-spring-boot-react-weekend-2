package kr.scalar.api.seat.service;

import kr.scalar.api.plex.domain.Plex;
import kr.scalar.api.seat.domain.Seat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface SeatService {
    void save(Seat seat);
    List<Seat> findAll();
    void existsById(long seatId);
    int count();
    Optional<Seat> findById(long seatId);
    Seat getById(long seatId);
    void deleteById(long seatId);
}
