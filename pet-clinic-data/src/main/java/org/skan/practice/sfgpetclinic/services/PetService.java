package org.skan.practice.sfgpetclinic.services;

import org.skan.practice.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Set<Pet> findAll();

    Pet save(Pet pet);
}
