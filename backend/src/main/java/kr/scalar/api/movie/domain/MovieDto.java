package kr.scalar.api.movie.domain;
import lombok.Data;

@Data
public class MovieDto {
    private long movieId;
    private String title; //제목
    private String director; //감독
    private String genre; //장르
    private String rate; //등급
}
