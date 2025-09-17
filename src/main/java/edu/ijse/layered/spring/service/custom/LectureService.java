package edu.ijse.layered.spring.service.custom;

import edu.ijse.layered.spring.dto.LectureDto;

import java.util.ArrayList;

public interface LectureService {

    void saveLecture(LectureDto lectureDto) throws Exception;
    void updateLecture(String lectureID, LectureDto newLectureDto) throws Exception;
    void deleteLecture(String lectureID) throws Exception;
    LectureDto searchLecture(String lectureID) throws Exception;
    ArrayList <LectureDto> getAllLecture() throws Exception;

}
