package kr.scalar.api.plex.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "plex")
public class Plex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private String plexId;
    @Column private String name;
    @Column private int rowNumber;
    @Column private int columnNumber;
}
