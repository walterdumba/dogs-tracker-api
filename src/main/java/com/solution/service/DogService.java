package com.solution.service;

import com.solution.adapter.dto.DogDTO;

import java.util.List;

/**
 * @Note
 * Given that I was unsuccessful to make this work with H2 database I'm mocking the entities
 * Just to have something returned to the API
 */
public interface DogService {

    List<String> getAllDogs();

    String createNewDog(DogDTO newDog);

    DogDTO getDog(Long id);

    String updateDog(Long id, DogDTO dog);

    String deleteDog(Long id);
}
