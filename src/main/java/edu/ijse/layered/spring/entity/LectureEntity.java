package edu.ijse.layered.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "lecture")
public class LectureEntity {

    @Id
    private String lectureID;
    private String name;
    private String contactDetails;

}
