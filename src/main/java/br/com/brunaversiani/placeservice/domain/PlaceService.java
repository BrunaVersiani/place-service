package br.com.brunaversiani.placeservice.domain;

import br.com.brunaversiani.placeservice.api.PlaceRequest;
import com.github.slugify.Slugify;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

public class PlaceService {
    private PlaceRepository placeRepository;
    private Slugify slugify;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
        this.slugify = Slugify.builder().build();
    }

    public Mono<Place> create(PlaceRequest placeRequest){
        var place = new Place(null, placeRequest.name(), slugify.slugify(placeRequest.name()),
                placeRequest.state(), placeRequest.createdAt(), placeRequest.updatedAt());
        return placeRepository.save(place);
    }
}
