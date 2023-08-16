package wali.springboot.petclinic.models;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "visits")
public class Visit  extends  BaseEntity{

    @Column(name = "date")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
    @Column(name = "description")
    private String description;

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
