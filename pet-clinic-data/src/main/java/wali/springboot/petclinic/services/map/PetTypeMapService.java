package wali.springboot.petclinic.services.map;

import org.springframework.stereotype.Service;
import wali.springboot.petclinic.models.Pet;
import wali.springboot.petclinic.models.PetType;
import wali.springboot.petclinic.services.PetTypeService;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractService<PetType,Long>implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save( object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteBYId(id);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
