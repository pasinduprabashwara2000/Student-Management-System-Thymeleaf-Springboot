package edu.ijse.layered.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "class")
public class ClassEntity {

    @Id
    private String classID;
    private String courseID;
    private String subjectID;
    private String lectureID;
    private Date date;

}
