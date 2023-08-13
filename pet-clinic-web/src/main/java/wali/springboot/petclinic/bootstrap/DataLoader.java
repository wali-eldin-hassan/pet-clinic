package wali.springboot.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import wali.springboot.petclinic.models.Owner;
import wali.springboot.petclinic.models.Pet;
import wali.springboot.petclinic.models.PetType;
import wali.springboot.petclinic.models.Vet;
import wali.springboot.petclinic.services.OwnerService;
import wali.springboot.petclinic.services.PetTypeService;
import wali.springboot.petclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private  final VetService vetService;

    private final PetTypeService petTypeService;



    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }
    @Override
    public void run(String... args) throws Exception {

        //petType bootStrap
        PetType dog=new PetType();
        dog.setName("dog");
        PetType dogType=petTypeService.save(dog);

        //example 2
        PetType cat=new PetType();
        cat.setName("cat");
        PetType catType=petTypeService.save(cat);
        System.out.println("Loaded PetType ....");

        //***************owner bootStrap ************************************************
        Owner owner1=new Owner();
        owner1.setFirstName("wali");
        owner1.setLastName("hassan");
        owner1.setAddress("sudan");
        owner1.setCity("khartoum");
        owner1.setPhone("+249905015553");
        Pet mikesPet= new Pet();
        mikesPet.setPetType(dogType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");

        ownerService.save(owner1);
        owner1.getPets().add(mikesPet);

        //example 2 ************************************************************************
        Owner owner2=new Owner();
        owner2.setFirstName("omer");
        owner2.setLastName("ali");
        owner1.setAddress("Cairo");
        owner1.setCity("Cairo");
        owner1.setPhone("+20192323983");
        Pet fionaCat=new Pet();
        fionaCat.setPetType(catType);
        fionaCat.setOwner(owner2);
        fionaCat.setBirthDate(LocalDate.now());
        fionaCat.setName("Lossy");
        owner2.getPets().add(fionaCat);

        ownerService.save(owner2);
        System.out.println("Loaded Owners ....");


        //********vet bootstrap***************************************************************
        Vet vet1=new Vet();
        vet1.setFirstName("sam");
        vet1.setLastName("axme");
        vetService.save(vet1);

        //example 2 ***************************************************************************
        Vet vet2=new Vet();
        vet2.setFirstName("mom");
        vet2.setLastName("lol");
        vetService.save(vet2);
        System.out.println("Loaded Vets ....");

    }
}
