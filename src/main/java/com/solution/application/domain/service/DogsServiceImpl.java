package com.solution.application.domain.service;

import com.solution.adapter.dto.DogDTO;
import com.solution.adapter.out.DogRepository;
import com.solution.service.DogService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
class DogsServiceImpl implements DogService {

    @Inject
    private DogRepository dogRepository;

    public List<String> getAllDogs() {
        return List.of("Dog1","Dog2","Dog3");
    }

    @Override
    public String createNewDog(DogDTO newDog) {
        throw new RuntimeException("Service not implemented");
    }

    @Override
    public DogDTO getDog(Long id) {
        throw new RuntimeException("Service not implemented");
    }

    @Override
    public String updateDog(Long id, DogDTO dog) {
        throw new RuntimeException("Service not implemented");
    }

    @Override
    public String deleteDog(Long id) {
        throw new RuntimeException("Service not implemented");
    }
}
