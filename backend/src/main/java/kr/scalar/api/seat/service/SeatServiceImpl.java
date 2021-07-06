package kr.scalar.api.seat.service;

import kr.scalar.api.seat.domain.Seat;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class SeatServiceImpl implements SeatService{

    private final SeatServiceImpl seatService;

    @Override
    public ArrayList<Seat> getReservedSeat(String plexName, LocalDate ReserveDay) {
        return null;
    }

    @Override
    public ArrayList<Seat> getReservedSeat(String plexName, LocalDate ReserveDay, String reserveTime) {
        return null;
    }
}
