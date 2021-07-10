package kr.scalar.api.seat.service;

import kr.scalar.api.plex.domain.Plex;
import kr.scalar.api.seat.domain.Seat;
import kr.scalar.api.seat.repository.SeatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SeatServiceImpl implements SeatService{

    private final SeatRepository seatRepository;


    @Override
    public void save(Seat seat) {
        seatRepository.save(seat);
    }

    @Override
    public List<Seat> findAll() {
        return seatRepository.findAll();
    }

    @Override
    public void existsById(long seatId) {
        seatRepository.existsById(seatId);
    }

    @Override
    public int count() {
        return (int)seatRepository.count();
    }

    @Override
    public Optional<Seat> findById(long seatId) {
        return seatRepository.findById(seatId);
    }

    @Override
    public Seat getById(long seatId) {
        return seatRepository.getById(seatId);
    }

    @Override
    public void deleteById(long seatId) {
        seatRepository.deleteById(seatId);
    }
}
