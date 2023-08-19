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
@Table(name = "Specialities")
public class Speciality  extends  BaseEntity{
    @Column(name = "description")
    private String description;

}
