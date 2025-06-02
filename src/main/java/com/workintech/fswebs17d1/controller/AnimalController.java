package com.workintech.fswebs17d1.controller;

import com.workintech.fswebs17d1.entity.Animal;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/workintech")
public class AnimalController {
    private Map<Integer, Animal> animals;

    @PostConstruct
    public void start(){
        this.animals = new HashMap<>();
    }

    @GetMapping("/animal")
    public List<Animal> getAnimals(){
        return animals.values().stream().toList();
    }
    @GetMapping("/animal/{id}")
    public Animal getAnimal(@PathVariable Integer id){
        return animals.get(id);
    }

    @PostMapping("/animal")
    public Animal postAni(@RequestBody Animal animal){
        animals.put(animal.getId(), animal);
        return animal;
    }

    @PutMapping("/animal/{id}")
    public Animal putAni(String name,@PathVariable Integer id){
        animals.put(id, new Animal(id, name));
        return new Animal(id, name);
    }

    @DeleteMapping("/animal/{id}")
    public Animal deleteAni(@PathVariable Integer id){
        Animal animal = animals.get(id);
        animals.remove(id);
        return animal;
    }
}
