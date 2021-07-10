package kr.scalar.api.seat.controller;
import kr.scalar.api.seat.domain.Seat;
import kr.scalar.api.seat.service.SeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/seats")
public class SeatController {
    private final SeatService seatService;

    @PostMapping("")
    public void save(@RequestBody Seat seat) {
        seatService.save(seat);
    }
    @GetMapping("")
    public List<Seat> findAll() {
        return seatService.findAll();
    }
    @GetMapping("/{seatId}")
    public void existsById(@RequestParam long seatId) {
        seatService.existsById(seatId);
    }
    @GetMapping("/count")
    public int count() {
        return seatService.count();
    }
    @GetMapping("/{seatId}")
    public Optional<Seat> findById(@RequestParam long seatId) {
        return seatService.findById(seatId);
    }
    @GetMapping("/{seatId}")
    public Seat getById(@RequestParam long seatId) {
        return seatService.getById(seatId);
    }
    @DeleteMapping("/{seatId}")
    public void deleteById(@RequestParam long seatId) {
        seatService.deleteById(seatId);
    }
}
