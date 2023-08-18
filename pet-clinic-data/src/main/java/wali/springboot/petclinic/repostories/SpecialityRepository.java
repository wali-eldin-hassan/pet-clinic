package wali.springboot.petclinic.repostories;

import org.springframework.data.repository.CrudRepository;
import wali.springboot.petclinic.models.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
