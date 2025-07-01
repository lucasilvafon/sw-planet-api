package com.example.sw_planet_api.domain;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

public class QueryBuilder {
    public static Example<Planet> makeQuery(Planet planet) {
        ExampleMatcher exampleMatcher = ExampleMatcher.matchingAll()
                .withIgnoreNullValues()
                .withIgnoreCase()
                .withMatcher("terrain", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
                .withMatcher("climate", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase());

        return Example.of(planet, exampleMatcher);
    }
}
