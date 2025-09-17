package edu.ijse.layered.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SubjectEntity {

    private String subjectID;
    private String name;
    private String courseID;

}
