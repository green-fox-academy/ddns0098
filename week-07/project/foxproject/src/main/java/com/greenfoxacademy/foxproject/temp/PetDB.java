package com.greenfoxacademy.foxproject.temp;

import com.greenfoxacademy.foxproject.models.Pet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PetDB {

  public final List<Pet> PETS = new ArrayList<>();

}
