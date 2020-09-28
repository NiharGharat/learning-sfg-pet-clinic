package services;

import com.nihar.learning.sfgpetclinic.model.Pet;
import com.nihar.learning.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet findByLastName(String lastName);
    Vet save(Vet pet);
    Set<Vet> finaAll();
}
