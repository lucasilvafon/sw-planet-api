package com.example.sw_planet_api.domain;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanetService {
    private PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository){
        this.planetRepository = planetRepository;
    }
    public  Planet create(Planet planet){
        return planetRepository.save(planet);
    }

    public Optional<Planet> get(Long id) {
        return  planetRepository.findById(id);
    }

    public Optional<Planet> getByName(String name) {
        return planetRepository.findByName(name);
    }

    public Optional<Planet> deleteById(Long id) {
        Optional<Planet> planet = planetRepository.findById(id);
        planet.ifPresent(planetRepository::delete);
        return planet;
    }
}
