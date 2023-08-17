package wali.springboot.petclinic.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import wali.springboot.petclinic.models.Pet;
import wali.springboot.petclinic.models.Speciality;
import wali.springboot.petclinic.repostories.SpecialityRepository;
import wali.springboot.petclinic.services.SpecialitiyService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")

// TODO: 17/08/2023
// Make sure it's work
public class SpecialitiySDJpaServcies implements SpecialitiyService {
    private final SpecialityRepository specialityRepository;

    public SpecialitiySDJpaServcies(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {

        Set<Speciality>specialities=new HashSet<>();
        specialityRepository.findAll().addAll(specialities);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
