package edu.ijse.layered.spring.service.custom.impl;

import edu.ijse.layered.spring.dto.CourseDto;
import edu.ijse.layered.spring.service.custom.CourseService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Transactional
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    @Override
    public void saveCourse(CourseDto courseDto) throws Exception {

    }

    @Override
    public void updateCourse(String courseID, CourseDto newCourseDto) throws Exception {

    }

    @Override
    public void deleteCourse(String courseID) throws Exception {

    }

    @Override
    public CourseDto searchCourse(String courseID) throws Exception {
        return null;
    }

    @Override
    public ArrayList<CourseDto> getAllCourses() throws Exception {
        return null;
    }
}
