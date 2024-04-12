package br.com.brunaversiani.placeservice.web;

import br.com.brunaversiani.placeservice.api.PlaceResponse;
import br.com.brunaversiani.placeservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place){
        return new PlaceResponse(place.name(), place.slug(), place.state(),
                place.createdAt(), place.updatedAt());
    }
}
