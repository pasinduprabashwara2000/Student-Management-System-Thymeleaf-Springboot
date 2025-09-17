package edu.ijse.layered.spring.dao;

import edu.ijse.layered.spring.entity.LectureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureDao extends JpaRepository <LectureEntity, String> {
}
