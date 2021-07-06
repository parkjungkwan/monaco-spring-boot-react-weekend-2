package kr.scalar.api.reservation.controller;
import kr.scalar.api.reservation.service.ReservationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/reservations")
public class ReservationController {

    private final ReservationServiceImpl reservationService;
}
