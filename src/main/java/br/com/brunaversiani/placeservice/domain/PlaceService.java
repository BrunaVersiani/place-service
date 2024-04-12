package br.com.brunaversiani.placeservice.domain;

import br.com.brunaversiani.placeservice.api.PlaceRequest;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

public class PlaceService {
    private PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository){
        this.placeRepository = placeRepository;
    }

    public Mono<Place> create(PlaceRequest placeRequest){
        var place = new Place(null, placeRequest.name(), placeRequest.slug(),
                placeRequest.state(), placeRequest.createdAt(), placeRequest.updatedAt());
        return placeRepository.save(place);
    }
}
