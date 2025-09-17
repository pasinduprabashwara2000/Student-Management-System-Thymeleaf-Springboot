package edu.ijse.layered.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDto {

    private int regNum;
    private String name;
    private String contact_details;

}
