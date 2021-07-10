package kr.scalar.api.plex.service;

import kr.scalar.api.plex.domain.Plex;
import kr.scalar.api.plex.repository.PlexRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlexServiceImpl implements PlexService{
    PlexRepository plexRepository;

    @Override public List<Plex> findAll(){
        return plexRepository.findAll();
    }
    @Override public void save(Plex plex){
        plexRepository.save(plex);
    }
    @Override public int count(){
        return (int)plexRepository.count();
    }
    @Override public void deleteById(long plexId){
        plexRepository.deleteById(plexId);
    }
    @Override public void existsById(long plexId){
        plexRepository.existsById(plexId);
    }
    @Override public Optional<Plex> findById(long plexId){
        return plexRepository.findById(plexId);
    }
    @Override public Plex getById(long plexId){
        return plexRepository.getById(plexId);
    }
}
