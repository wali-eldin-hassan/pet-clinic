package wali.springboot.petclinic.services.map;

import org.springframework.stereotype.Service;
import wali.springboot.petclinic.models.BaseEntity;
import wali.springboot.petclinic.models.Speciality;
import wali.springboot.petclinic.services.CrudService;
import wali.springboot.petclinic.services.SpecialitiesService;

import java.util.Set;

@Service
public class SpecialityMapService extends AbstractService<Speciality,Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteBYId(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
