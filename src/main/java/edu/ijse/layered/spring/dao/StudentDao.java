package edu.ijse.layered.spring.dao;

import edu.ijse.layered.spring.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository <StudentEntity, String> {
}
