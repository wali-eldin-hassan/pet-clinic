package wali.springboot.petclinic.repostories;

import org.springframework.data.repository.CrudRepository;
import wali.springboot.petclinic.models.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
