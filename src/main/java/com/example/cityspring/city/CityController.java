package com.example.cityspring.city;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/city")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping(value = "/allCities")
    public List<City> getCities() {
        return cityService.getCities();
    }

    @PostMapping(value = "/insert")
    public void insertNewCity(@RequestBody City city) {
        cityService.addNewCity(city);
    }
}
