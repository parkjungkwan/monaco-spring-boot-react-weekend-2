package kr.scalar.api.plex.controller;
import kr.scalar.api.plex.service.PlexService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class PlexController {
    private final PlexService plexService;

}
