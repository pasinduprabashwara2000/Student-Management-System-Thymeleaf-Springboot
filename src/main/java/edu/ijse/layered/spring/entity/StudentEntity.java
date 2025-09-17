package edu.ijse.layered.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentEntity {

    private int regNum;
    private String name;
    private String contact_details;

}
