package com.greenfoxacademy.foxproject.repositories;

import com.greenfoxacademy.foxproject.models.Pet;
import org.springframework.stereotype.Component;

@Component
public interface PetRepository {

  void addPet(String name);

  Pet findOne(String name);

}
