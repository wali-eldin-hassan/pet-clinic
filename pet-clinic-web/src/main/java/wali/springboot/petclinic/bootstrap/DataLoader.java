package wali.springboot.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import wali.springboot.petclinic.models.Owner;
import wali.springboot.petclinic.models.Vet;
import wali.springboot.petclinic.services.OwnerService;
import wali.springboot.petclinic.services.VatService;
import wali.springboot.petclinic.services.map.OwnerServiceMap;
import wali.springboot.petclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private  final VatService vatService;




 public DataLoader()
 {
ownerService = new OwnerServiceMap();
vatService=new VetServiceMap();
 }
    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstName("wali");
        owner1.setLastName("hassan");
        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setId(2L);
        owner2.setFirstName("omer");
        owner2.setLastName("ali");
        ownerService.save(owner2);


        System.out.println("Loaded Owners ....");

        Vet vet1=new Vet();

        vet1.setId(1L);
        vet1.setFirstName("sam");
        vet1.setLastName("axme");
        vatService.save(vet1);

        Vet vet2=new Vet();

        vet2.setId(2L);
        vet2.setFirstName("mom");
        vet2.setLastName("lol");
        vatService.save(vet2);
        System.out.println("Loaded Vets ....");

    }
}