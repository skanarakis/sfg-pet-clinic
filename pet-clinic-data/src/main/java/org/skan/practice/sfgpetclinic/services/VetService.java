package org.skan.practice.sfgpetclinic.services;

import org.skan.practice.sfgpetclinic.model.Pet;
import org.skan.practice.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Pet findById(Long id);
    Set<Vet> findAll();

    Vet save(Vet vet);
}
