package edu.ijse.layered.spring.service.custom.impl;

import edu.ijse.layered.spring.dao.ClassDao;
import edu.ijse.layered.spring.dto.ClassDto;
import edu.ijse.layered.spring.entity.ClassEntity;
import edu.ijse.layered.spring.service.custom.ClassService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ClassServiceImpl implements ClassService {

    private final ClassDao classDao;

    @Override
    public void saveClass(ClassDto classDto) throws Exception {
        ClassEntity classEntity = new ClassEntity(
            classDto.getClassID(),
            classDto.getCourseID(),
            classDto.getSubjectID(),
            classDto.getLectureID(),
            classDto.getDate()
        );
        classDao.save(classEntity);
    }

    @Override
    public void updateClass(String classID, ClassDto newClassDto) throws Exception {

        Optional <ClassEntity> classExists = classDao.findById(classID);

        if (classExists.isPresent()){
            ClassEntity classEntity = classExists.get();
            classEntity.setCourseID(newClassDto.getCourseID());
            classEntity.setSubjectID(newClassDto.getSubjectID());
            classEntity.setLectureID(newClassDto.getLectureID());
            classEntity.setDate(newClassDto.getDate());
            classDao.save(classEntity);
        } else {
            throw new Exception("Class Not Found");
        }

    }

    @Override
    public void deleteClass(String classID) throws Exception {

    }

    @Override
    public ClassDto searchClass(String classID) throws Exception {
        return null;
    }

    @Override
    public ArrayList<ClassDto> getAllClass() throws Exception {
        return null;
    }
}
