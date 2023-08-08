package wali.springboot.petclinic.services.map;

import org.springframework.stereotype.Service;
import wali.springboot.petclinic.models.Owner;
import wali.springboot.petclinic.services.OwnerService;

import java.util.Set;

@Service

public class OwnerServiceMap extends AbstractService<Owner,Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
    super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
    super.deleteBYId(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}