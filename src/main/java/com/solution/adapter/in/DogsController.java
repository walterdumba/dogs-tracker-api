package com.solution.adapter.in;


import com.solution.adapter.dto.DogDTO;
import com.solution.service.DogService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/api/dogs")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DogsController {
    @Inject
    private DogService dogsService;

    @Get
    public List<String> getAllDogs(@QueryValue(value ="name", defaultValue = "") String name,
                                   @QueryValue(value ="breed", defaultValue ="-1") Long breed,
                                   @QueryValue(value = "supplier", defaultValue = "-1" ) Long supplier){

        return dogsService.getAllDogs();
    }

    @Get("/{id}")
    public DogDTO getDog(@PathVariable Long id){
        return dogsService.getDog(id);
    }

    @Put(value = "/{id}")
    public String updateDog(@PathVariable Long id, @PathVariable DogDTO dog){
        return dogsService.updateDog(id, dog);
    }

    @Post
    public String createNewDog(@Body DogDTO newDog){
        return dogsService.createNewDog(newDog);
    }

    @Delete("/{id}")
    public String delete(@PathVariable Long id){
        //TODO: Improve the return code
        return dogsService.deleteDog(id);
    }
}