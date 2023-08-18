package wali.springboot.petclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import wali.springboot.petclinic.models.Visit;
import wali.springboot.petclinic.services.VisitServices;

import java.util.Set;

@Service
@Profile({"default","map"})

public class VisitMapService  extends AbstractService<Visit,Long> implements VisitServices {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet()==null || visit.getPet().getOwner()==null||visit.getPet().getId()==null||
                visit.getPet().getOwner().getId()==null)
        {
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(visit);

    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteBYId(id);
    }
}
