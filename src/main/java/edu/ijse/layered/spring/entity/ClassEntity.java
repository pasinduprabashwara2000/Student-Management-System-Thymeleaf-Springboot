package edu.ijse.layered.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClassEntity {

    private String classID;
    private String courseID;
    private String subjectID;
    private String lectureID;
    private Date date;

}
