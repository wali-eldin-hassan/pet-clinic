package wali.springboot.petclinic.services.map;

import org.springframework.stereotype.Service;
import wali.springboot.petclinic.models.Speciality;
import wali.springboot.petclinic.models.Vet;
import wali.springboot.petclinic.services.SpecialitiyService;
import wali.springboot.petclinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractService<Vet,Long>implements VetService {

    private  final SpecialitiyService specialitiyService;

    public VetServiceMap(SpecialitiyService specialitiyService) {
        this.specialitiyService = specialitiyService;
    }

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
        if(!object.getSpecialities().isEmpty()){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId()== null)
                {
                    Speciality savedSpeciality=specialitiyService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save( object);
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
