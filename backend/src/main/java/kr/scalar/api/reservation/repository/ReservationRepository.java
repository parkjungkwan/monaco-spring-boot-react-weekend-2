package kr.scalar.api.reservation.repository;

import kr.scalar.api.reservation.domain.Reservation;
import kr.scalar.api.seat.domain.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
