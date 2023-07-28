package wali.springboot.petclinic.services;


import wali.springboot.petclinic.models.Vet;

import java.util.Set;

public interface VatService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
