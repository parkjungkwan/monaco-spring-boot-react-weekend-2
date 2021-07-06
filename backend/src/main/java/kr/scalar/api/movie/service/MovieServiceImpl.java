package kr.scalar.api.movie.service;

import kr.scalar.api.movie.domain.MovieDto;
import kr.scalar.api.movie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@RequiredArgsConstructor
@Service
public class MovieServiceImpl implements MovieService{

    private final MovieRepository movieRepository;

    @Override
    public void addMovie(MovieDto movie) {

    }

    @Override
    public MovieDto searchMovie(String title) throws Exception {
        return null;
    }

    @Override
    public void delMovie(String title) {

    }

    @Override
    public ArrayList<MovieDto> listMovie() throws Exception {
        return null;
    }
}
