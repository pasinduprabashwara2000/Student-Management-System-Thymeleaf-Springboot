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
@Table(name = "attendance")
public class AttendanceEntity {

    @Id
    private String attendanceID;
    private String lectureID;
    private String studentName;
    private String subjectName;
    private Date date;
    private String status;

}
