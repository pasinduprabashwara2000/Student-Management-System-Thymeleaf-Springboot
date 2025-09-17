package edu.ijse.layered.spring.service.custom;

import edu.ijse.layered.spring.dto.StudentDto;

import java.util.ArrayList;

public interface StudentService {

    void saveStudent(StudentDto studentDto) throws Exception;
    void updateStudent(String regNum, StudentDto newStudentDto) throws Exception;
    void deleteStudent(String regNum) throws Exception;
    StudentDto searchStudent(String regNum) throws Exception;
    ArrayList <StudentDto> getAllStudent() throws Exception;

}
