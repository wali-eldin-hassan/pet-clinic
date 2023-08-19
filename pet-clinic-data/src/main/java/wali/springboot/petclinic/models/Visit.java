package wali.springboot.petclinic.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "visits")
public class Visit  extends  BaseEntity{

    @Column(name = "date")
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
    @Column(name = "description")
    private String description;

}
