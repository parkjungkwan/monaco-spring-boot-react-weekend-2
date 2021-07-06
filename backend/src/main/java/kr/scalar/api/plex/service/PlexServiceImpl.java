package kr.scalar.api.plex.service;

import kr.scalar.api.plex.domain.PlexDto;
import kr.scalar.api.plex.repository.PlexRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class PlexServiceImpl implements PlexService{

    private final PlexRepository plexRepository;

    @Override
    public int regPlex(PlexDto vo) {
        return 0;
    }

    @Override
    public PlexDto selectByNo(int plexNo) {
        return null;
    }

    @Override
    public PlexDto selectByName(String name) {
        return null;
    }

    @Override
    public boolean isExist(int plexNo) {
        return false;
    }

    @Override
    public boolean isExistName(String name) {
        return false;
    }

    @Override
    public int delete(int plexNo) {
        return 0;
    }

    @Override
    public ArrayList<PlexDto> selectAll() {
        return null;
    }

    @Override
    public int update(PlexDto vo) {
        return 0;
    }
}
