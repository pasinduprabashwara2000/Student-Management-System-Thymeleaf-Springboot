package edu.ijse.layered.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SubjectDto {

    private String subjectID;
    private String name;
    private String courseID;

}
