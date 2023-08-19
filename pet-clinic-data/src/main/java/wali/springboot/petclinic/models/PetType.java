package wali.springboot.petclinic.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "types")
public class PetType extends  BaseEntity {

    @Column(name = "name")
    private  String name;

}
