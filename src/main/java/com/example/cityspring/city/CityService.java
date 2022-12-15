package com.example.cityspring.city;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getCities() {
        return cityRepository.findAll();
    }

    public void addNewCity(City city) {
        String president = city.getPresident();
        Optional<City> maybeCity = cityRepository.findByPresident(president);
        if (maybeCity.isPresent()) {
            throw new IllegalStateException(
                    "there is president " + maybeCity.get().getPresident() + " and he rules city"
                            + maybeCity.get().getName());
        }
        city.setId(UUID.randomUUID());
        cityRepository.save(city);
    }
}
