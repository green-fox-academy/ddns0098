package com.greenfoxacademy.foxproject.services;

import com.greenfoxacademy.foxproject.models.Pet;
import org.springframework.stereotype.Component;

@Component
public interface PetService {

  Pet login(String name);

  Pet findOne(String name);

  boolean checkLogged(Pet pet);

}
