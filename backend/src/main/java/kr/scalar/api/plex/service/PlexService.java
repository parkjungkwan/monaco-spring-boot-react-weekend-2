package kr.scalar.api.plex.service;

import kr.scalar.api.plex.domain.Plex;

import java.util.List;
import java.util.Optional;

public interface PlexService {
    void save(Plex plex);
    List<Plex> findAll();
    void existsById(long plexId);
    int count();
    Optional<Plex> findById(long plexId);
    Plex getById(long plexId);
    void deleteById(long plexId);
    /*
    int regPlex(PlexDto vo);
    PlexDto selectByNo(int plexNo);
    PlexDto selectByName(String name);
    boolean isExist(int plexNo);
    boolean isExistName(String name);
    int delete(int plexNo);
    ArrayList<PlexDto> selectAll();
    int update(PlexDto vo);
*/
}
