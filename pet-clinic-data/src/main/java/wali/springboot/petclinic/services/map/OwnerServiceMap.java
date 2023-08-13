package wali.springboot.petclinic.services.map;

import org.springframework.stereotype.Service;
import wali.springboot.petclinic.models.Owner;
import wali.springboot.petclinic.models.Pet;
import wali.springboot.petclinic.services.OwnerService;
import wali.springboot.petclinic.services.PetService;
import wali.springboot.petclinic.services.PetTypeService;

import java.util.Set;

@Service

public class OwnerServiceMap extends AbstractService<Owner,Long> implements OwnerService {

    private  final PetService petService;
    private  final PetTypeService petTypeService;

    public OwnerServiceMap(PetService petService, PetTypeService petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }



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
        if (object != null)
        {
            if(object.getPets()!= null)
            {
                object.getPets().forEach(pet -> {
                    if(pet.getPetType()!= null)
                    {
                        if(pet.getPetType().getId()==null)
                        {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }else {
                        throw  new RuntimeException("Pet Type is required");
                    }
                    if (pet.getId()==null)
                    {
                        Pet savedPet=petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save( object);

        }else {
            return  null;
        }
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