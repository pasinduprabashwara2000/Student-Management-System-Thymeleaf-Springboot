package edu.ijse.layered.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LectureEntity {

    private String lectureID;
    private String name;
    private String contactDetails;

}
