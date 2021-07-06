package kr.scalar.api.reservation.service;

import kr.scalar.api.reservation.domain.Reservation;
import kr.scalar.api.reservation.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public Long save(Reservation reserve) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Reservation findOne(Long id) {
        return null;
    }

    @Override
    public List<Reservation> findAll(String userid) {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public int getSalesByDay(LocalDate date) {
        return 0;
    }

    @Override
    public int getSalesByMonth(String startDay, String lastDay) {
        return 0;
    }

    @Override
    public int getSalesByMovie(String movieName) {
        return 0;
    }

    @Override
    public Reservation settingData(ResultSet rs) {
        return null;
    }
}
