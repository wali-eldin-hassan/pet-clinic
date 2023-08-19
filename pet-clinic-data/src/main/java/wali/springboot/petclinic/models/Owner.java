package wali.springboot.petclinic.models;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "owners")
public class Owner extends Person{

    @Builder
    public Owner( Long id,String firstName,String lastName,String city, String phone, Set<Pet> pets, String address) {
        super(id,firstName,lastName);
        this.city = city;
        this.phone = phone;
        this.pets = pets;
        this.address = address;
    }

    @Column(name = "city")
    private  String city;
    @Column(name = "phone")
    private String phone;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();
    @Column(name = "address")
    private  String address;





}
