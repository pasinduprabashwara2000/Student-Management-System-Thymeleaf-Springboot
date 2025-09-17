package edu.ijse.layered.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AttendanceDto {

    private String attendanceID;
    private String lectureID;
    private String studentName;
    private String subjectName;
    private Date date;
    private String status;

}
