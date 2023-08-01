package wali.springboot.petclinic.services;

import wali.springboot.petclinic.models.Owner;

import java.util.Set;

public interface OwnerService  extends  CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}
