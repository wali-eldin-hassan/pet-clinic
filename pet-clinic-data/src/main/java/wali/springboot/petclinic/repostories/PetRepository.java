package wali.springboot.petclinic.repostories;

import org.springframework.data.repository.CrudRepository;
import wali.springboot.petclinic.models.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
