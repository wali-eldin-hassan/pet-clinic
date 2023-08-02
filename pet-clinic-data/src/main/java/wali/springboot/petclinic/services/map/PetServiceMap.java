package wali.springboot.petclinic.services.map;

import wali.springboot.petclinic.models.Pet;
import wali.springboot.petclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractService<Pet,Long> implements CrudService<Pet,Long> {
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
            return super.save(object.getId(), object);
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
