package wali.springboot.petclinic.repostories;

import org.springframework.data.repository.CrudRepository;
import wali.springboot.petclinic.models.Owner;

public interface OwnerRepository  extends CrudRepository<Owner,Long> {
}
