package guru.springframework.msscbrewery.service;

import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeer(UUID beerId) {
        return BeerDto.builder()
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .id(UUID.randomUUID())
                .build();
    }
}
