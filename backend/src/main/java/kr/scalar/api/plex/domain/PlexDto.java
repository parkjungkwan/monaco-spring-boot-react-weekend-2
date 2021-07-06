package kr.scalar.api.plex.domain;

import lombok.Data;

@Data
public class PlexDto {
    private int plexId;
    private String name;
    private int rowNumber;
    private int columnNumber;
}
