package edu.ijse.layered.spring.service.custom.impl;

import edu.ijse.layered.spring.dao.CourseDao;
import edu.ijse.layered.spring.dto.CourseDto;
import edu.ijse.layered.spring.entity.CourseEntity;
import edu.ijse.layered.spring.service.custom.CourseService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseDao courseDao;

    @Override
    public void saveCourse(CourseDto courseDto) throws Exception {
        CourseEntity courseEntity = new CourseEntity(
          courseDto.getCourseID(),
          courseDto.getName()
        );
        courseDao.save(courseEntity);
    }

    @Override
    public void updateCourse(String courseID, CourseDto newCourseDto) throws Exception {

        Optional <CourseEntity> courseExists = courseDao.findById(courseID);

        if(courseExists.isPresent()){
            CourseEntity courseEntity = courseExists.get();
            courseEntity.setName(newCourseDto.getName());
            courseDao.save(courseEntity);
        } else {
            throw new Exception("Course Not Found");
        }

    }

    @Override
    public void deleteCourse(String courseID) throws Exception {

        Optional <CourseEntity> courseExists = courseDao.findById(courseID);

        if (courseExists.isPresent()){
            courseDao.deleteById(courseID);
        } else {
            throw new Exception("Course Not Found");
        }
    }

    @Override
    public CourseDto searchCourse(String courseID) throws Exception {

        Optional <CourseEntity> courseExists = courseDao.findById(courseID);

        if(courseExists.isEmpty()){
            throw new Exception("Course Not Found");
        }

        CourseEntity courseEntity = courseExists.get();
        return new CourseDto(
                courseEntity.getCourseID(),
                courseEntity.getName()
        );
    }

    @Override
    public ArrayList<CourseDto> getAllCourses() throws Exception {

        List<CourseEntity> courseEntities = courseDao.findAll();
        ArrayList <CourseDto> courseDtos = new ArrayList<>();

        for (CourseEntity courseEntity : courseEntities){
            CourseDto courseDto = new CourseDto(
              courseEntity.getCourseID(),
              courseEntity.getName()
            );
            courseDtos.add(courseDto);
        }

        return courseDtos;
    }
}
