package edu.ijse.layered.spring.service.custom;

import edu.ijse.layered.spring.dto.ClassDto;

import java.util.ArrayList;

public interface ClassService {

    void saveClass (ClassDto classDto) throws Exception;
    void updateClass (String classID, ClassDto newClassDto) throws Exception;
    void deleteClass (String classID) throws Exception;
    ClassDto searchClass (String classID) throws Exception;
    ArrayList <ClassDto> getAllClass() throws Exception;

}
