package edu.ijse.layered.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "student")
public class StudentEntity {

    @Id
    private int regNum;
    private String name;
    private String contact_details;

}
