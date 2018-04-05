package com.greenfoxacademy.di;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
  ArrayList<String> names;

  public StudentService() {
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
  }

  public List<String> findAll() {
    return names;
  }

  public void save(String student) {
    names.add(student);
  }

  public int count() {
    return names.size();
  }

  public boolean isInList(String name) {
    for (int i = 0; i < names.size(); i++) {
      if (names.get(i).equals(name)) {
        return true;
      }
    }
    return false;
  }
}