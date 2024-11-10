package ua.edu.ucu.user;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.beans.Transient;
import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Getter @Setter @AllArgsConstructor
@Table @Entity
public class User {
    String name;
    String gender;
    LocalDate dateOfBirth;
    
    @Column(unique = true, nullable = false)
    private String email;

    @Id
    private long id;

    @Transient
    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
    
}
