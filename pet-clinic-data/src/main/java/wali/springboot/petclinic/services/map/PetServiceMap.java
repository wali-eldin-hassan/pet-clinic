package wali.springboot.petclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import wali.springboot.petclinic.models.Pet;
import wali.springboot.petclinic.services.PetService;

import java.util.Set;

@Service
@Profile({"default","map"})

public class PetServiceMap extends AbstractService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
            return super.save( object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteBYId(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
