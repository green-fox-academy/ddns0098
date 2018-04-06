package com.greenfoxacademy.foxproject.repositories;

import com.greenfoxacademy.foxproject.models.Pet;
import com.greenfoxacademy.foxproject.temp.PetDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PetRepositoryImpl implements PetRepository {

  private PetDB petDB;

  @Autowired
  public PetRepositoryImpl(PetDB petDB) {
    this.petDB = petDB;
  }

  @Override
  public void addPet(String name) {
    petDB.PETS.add(new Pet(name));
  }

  @Override
  public Pet findOne(String name) {
    for (Pet pet : petDB.PETS) {
      if (pet.getName().equals(name)) {
        return pet;
      }
    }
    return null;
  }

}
