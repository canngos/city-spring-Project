package com.example.cityspring.city;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {

    Optional<City> findByPresident(String president);
}
