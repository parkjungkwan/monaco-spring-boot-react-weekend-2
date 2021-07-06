package kr.scalar.api.seat.repository;

import kr.scalar.api.seat.domain.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository  extends JpaRepository<Seat, Long> {
}
