package wali.springboot.petclinic.repostories;

import org.springframework.data.repository.CrudRepository;
import wali.springboot.petclinic.models.Vet;

public interface VetRepository  extends CrudRepository<Vet,Long> {
}
