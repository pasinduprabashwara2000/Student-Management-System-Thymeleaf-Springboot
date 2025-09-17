package edu.ijse.layered.spring.service.custom.impl;

import edu.ijse.layered.spring.dao.LectureDao;
import edu.ijse.layered.spring.dto.LectureDto;
import edu.ijse.layered.spring.entity.LectureEntity;
import edu.ijse.layered.spring.service.custom.LectureService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class LectureServiceIMpl implements LectureService {

    private final LectureDao lectureDao;

    @Override
    public void saveLecture(LectureDto lectureDto) throws Exception {
        LectureEntity lectureEntity = new LectureEntity(
            lectureDto.getLectureID(),
            lectureDto.getName(),
            lectureDto.getContactDetails()
        );
        lectureDao.save(lectureEntity);
    }

    @Override
    public void updateLecture(String lectureID, LectureDto newLectureDto) throws Exception {

        Optional <LectureEntity> lectureExists = lectureDao.findById(lectureID);

        if (lectureExists.isPresent()){
            LectureEntity lectureEntity = lectureExists.get();
            lectureEntity.setName(newLectureDto.getName());
            lectureEntity.setContactDetails(newLectureDto.getContactDetails());
            lectureDao.save(lectureEntity);
        } else {
            throw new Exception("Lecture Not Found !");
        }

    }

    @Override
    public void deleteLecture(String lectureID) throws Exception {

        Optional <LectureEntity> lectureExists = lectureDao.findById(lectureID);

        if(lectureExists.isPresent()){
            lectureDao.deleteById(lectureID);
        } else {
            throw new Exception("Lecture Not Found");
        }

    }

    @Override
    public LectureDto searchLecture(String lectureID) throws Exception {

        Optional <LectureEntity> lectureExists = lectureDao.findById(lectureID);

        if (lectureExists.isEmpty()){
            throw new Exception("Lecture Not Found");
        }

        LectureEntity lectureEntities = lectureExists.get();
        return new LectureDto(
                lectureEntities.getLectureID(),
                lectureEntities.getName(),
                lectureEntities.getContactDetails()
        );
    }

    @Override
    public ArrayList<LectureDto> getAllLecture() throws Exception {

        List<LectureEntity> lectureEntities = lectureDao.findAll();
        ArrayList <LectureDto> lectureDtos = new ArrayList<>();

        for (LectureEntity lectureEntity : lectureEntities){
            LectureDto lectureDto = new LectureDto(
                lectureEntity.getLectureID(),
                lectureEntity.getName(),
                lectureEntity.getContactDetails()
            );
            lectureDtos.add(lectureDto);
        }

        return lectureDtos;
    }
}
