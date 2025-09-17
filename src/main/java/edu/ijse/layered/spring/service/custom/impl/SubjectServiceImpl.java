package edu.ijse.layered.spring.service.custom.impl;

import edu.ijse.layered.spring.dao.SubjectDao;
import edu.ijse.layered.spring.dto.SubjectDto;
import edu.ijse.layered.spring.entity.SubjectEntity;
import edu.ijse.layered.spring.service.custom.SubjectService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    private final SubjectDao subjectDao;

    @Override
    public void saveSubject(SubjectDto subjectDto) throws Exception {
        SubjectEntity subjectEntity = new SubjectEntity(
          subjectDto.getSubjectID(),
          subjectDto.getName(),
          subjectDto.getCourseID()
        );
        subjectDao.save(subjectEntity);
    }

    @Override
    public void updateSubject(String subjectID, SubjectDto newSubjectDto) throws Exception {

        Optional <SubjectEntity> subjectExists = subjectDao.findById(subjectID);

        if(subjectExists.isPresent()){
            SubjectEntity subjectEntity = subjectExists.get();
            subjectEntity.setName(newSubjectDto.getName());
            subjectEntity.setName(newSubjectDto.getCourseID());
            subjectDao.save(subjectEntity);
        } else {
            throw new Exception("Subject Not Found");
        }

    }

    @Override
    public void deleteSubject(String subjectID) throws Exception {

        Optional <SubjectEntity> subjectExists = subjectDao.findById(subjectID);

        if(subjectExists.isPresent()){
            subjectDao.deleteById(subjectID);
        } else {
            throw new Exception("Subject is Not Found");
        }

    }

    @Override
    public SubjectDto searchSubject(String subjectID) throws Exception {

        Optional <SubjectEntity> subjectExists = subjectDao.findById(subjectID);

        if(subjectExists.isEmpty()){
            throw new Exception("Subject Not Found");
        }

        SubjectEntity subjectEntity = subjectExists.get();

        return new SubjectDto(
                subjectEntity.getSubjectID(),
                subjectEntity.getName(),
                subjectEntity.getCourseID()
        );

    }

    @Override
    public ArrayList<SubjectDto> getAllSubject() throws Exception {

        List<SubjectEntity> subjectEntities = subjectDao.findAll();
        ArrayList <SubjectDto> subjectDtos = new ArrayList<>();

        for(SubjectEntity subjectEntity : subjectEntities){
            SubjectDto subjectDto = new SubjectDto(
              subjectEntity.getSubjectID(),
              subjectEntity.getName(),
              subjectEntity.getCourseID()
            );
            subjectDtos.add(subjectDto);
        }

        return subjectDtos;
    }
}
