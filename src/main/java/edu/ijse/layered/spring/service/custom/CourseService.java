package edu.ijse.layered.spring.service.custom;

import edu.ijse.layered.spring.dto.CourseDto;
import java.util.ArrayList;

public interface CourseService {

    void saveCourse(CourseDto courseDto) throws Exception;
    void updateCourse(String courseID, CourseDto newCourseDto) throws Exception;
    void deleteCourse(String courseID) throws Exception;
    CourseDto searchCourse(String courseID) throws Exception;
    ArrayList <CourseDto> getAllCourses() throws Exception;

}
