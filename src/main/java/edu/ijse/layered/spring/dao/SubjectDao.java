package edu.ijse.layered.spring.dao;

import edu.ijse.layered.spring.entity.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectDao extends JpaRepository <SubjectEntity, String> {
}
