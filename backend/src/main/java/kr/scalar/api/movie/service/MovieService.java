package kr.scalar.api.movie.service;

import kr.scalar.api.movie.domain.MovieDto;

import java.util.ArrayList;

public interface MovieService {
    void addMovie(MovieDto movievo); //영화 등록

    MovieDto searchMovie(String title) throws Exception; //영화 조회

    void delMovie(String title) ; //영화 삭제

    ArrayList<MovieDto> listMovie() throws Exception; //영화 리스트 열람
}
