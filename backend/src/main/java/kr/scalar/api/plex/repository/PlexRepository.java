package kr.scalar.api.plex.repository;

import kr.scalar.api.plex.domain.Plex;
import kr.scalar.api.reservation.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlexRepository extends JpaRepository<Plex, Long> {
}
