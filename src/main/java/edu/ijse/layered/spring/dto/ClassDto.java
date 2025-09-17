package edu.ijse.layered.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClassDto {

    private String classID;
    private String courseID;
    private String subjectID;
    private String lectureID;
    private Date date;

}
