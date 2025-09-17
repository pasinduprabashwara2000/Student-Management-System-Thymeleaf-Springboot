package edu.ijse.layered.spring.service.custom;

import edu.ijse.layered.spring.dto.SubjectDto;

import java.util.ArrayList;

public interface SubjectService {

    void saveSubject(SubjectDto subjectDto) throws Exception;
    void updateSubject(String subjectID, SubjectDto newSubjectDto) throws Exception;
    void deleteSubject(String subjectID) throws Exception;
    SubjectDto searchSubject(String subjectID) throws Exception;
    ArrayList <SubjectDto> getAllSubject() throws Exception;

}
