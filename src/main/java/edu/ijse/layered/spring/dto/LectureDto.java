package edu.ijse.layered.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LectureDto {

    private String lectureID;
    private String name;
    private String contactDetails;

}
