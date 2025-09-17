package edu.ijse.layered.spring.service.custom.impl;

import edu.ijse.layered.spring.dao.StudentDao;
import edu.ijse.layered.spring.dto.StudentDto;
import edu.ijse.layered.spring.entity.StudentEntity;
import edu.ijse.layered.spring.service.custom.StudentService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentDao studentDao;

    @Override
    public void saveStudent(StudentDto studentDto) throws Exception {
        StudentEntity studentEntity = new StudentEntity(
          studentDto.getRegNum(),
          studentDto.getName(),
          studentDto.getContact_details()
        );
        studentDao.save(studentEntity);
    }

    @Override
    public void updateStudent(String regNum, StudentDto newStudentDto) throws Exception {
        Optional <StudentEntity> studentExists = studentDao.findById(regNum);

            if(studentExists.isPresent()){
                StudentEntity studentEntity = studentExists.get();
                studentEntity.setName(newStudentDto.getName());
                studentEntity.setContact_details(newStudentDto.getContact_details());
                studentDao.save(studentEntity);
            } else {
                throw new Exception("Student Not Found !");
            }
    }

    @Override
    public void deleteStudent(String regNum) throws Exception {
        Optional <StudentEntity> studentExists = studentDao.findById(regNum);

        if(studentExists.isPresent()){
            studentDao.deleteById(regNum);
        } else {
            throw new Exception("Student Not Found !");
        }
    }

    @Override
    public StudentDto searchStudent(String regNum) throws Exception {

        Optional <StudentEntity> studentExists = studentDao.findById(regNum);

        if(studentExists.isEmpty()){
            throw new Exception("Student Not Found");
        }

        StudentEntity studentEntity = studentExists.get();
        return new StudentDto(
                studentEntity.getRegNum(),
                studentEntity.getName(),
                studentEntity.getContact_details()
        );

    }

    @Override
    public ArrayList<StudentDto> getAllStudent() throws Exception {

        List <StudentEntity> studentEntities = studentDao.findAll();
        ArrayList<StudentDto> studentDtos = new ArrayList<>();

        for (StudentEntity studentEntity : studentEntities ){
             StudentDto studentDto = new StudentDto(
                     studentEntity.getRegNum(),
                     studentEntity.getName(),
                     studentEntity.getContact_details()
             );
             studentDtos.add(studentDto);
        }

        return studentDtos;

    }
}
