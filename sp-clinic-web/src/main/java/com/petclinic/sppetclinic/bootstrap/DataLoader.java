package com.petclinic.sppetclinic.bootstrap;

import com.petclinic.sppetclinic.map.OwnerServiceMap;
import com.petclinic.sppetclinic.map.VetServiceMap;
import com.petclinic.sppetclinic.model.Owner;
import com.petclinic.sppetclinic.model.Vet;
import com.petclinic.sppetclinic.services.OwnerService;
import com.petclinic.sppetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("michel");
        owner1.setLastName("watson");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("test");
        owner2.setLastName("name");

        ownerService.save(owner2);

        System.out.println("loading Owners .....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("sam");
        vet1.setLastName("axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("sam");
        vet2.setLastName("ace");

        vetService.save(vet2);

        System.out.println("loading Vet ....");
    }
}
