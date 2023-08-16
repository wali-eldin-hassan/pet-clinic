package wali.springboot.petclinic.repostories;

import org.springframework.data.repository.CrudRepository;
import wali.springboot.petclinic.models.PetType;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {

}
