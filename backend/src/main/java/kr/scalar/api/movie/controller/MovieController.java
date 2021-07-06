package kr.scalar.api.movie.controller;
import kr.scalar.api.movie.service.MovieServiceImpl;
import kr.scalar.api.plex.domain.Plex;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/movies")
public class MovieController{
    private final MovieServiceImpl movieService;
}
