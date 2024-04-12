package br.com.brunaversiani.placeservice.config;

import br.com.brunaversiani.placeservice.domain.PlaceRepository;
import br.com.brunaversiani.placeservice.domain.PlaceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlaceConfig {

    @Bean
    PlaceService placeService(PlaceRepository placeRepository){
        return  new PlaceService(placeRepository);
    }
}
