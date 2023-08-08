package wali.springboot.petclinic.services.map;

import org.springframework.stereotype.Service;
import wali.springboot.petclinic.models.Vet;
import wali.springboot.petclinic.services.VatService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractService<Vet,Long>implements VatService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
    super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
    super.deleteBYId(id);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
