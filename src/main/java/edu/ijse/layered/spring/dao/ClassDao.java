package edu.ijse.layered.spring.dao;

import edu.ijse.layered.spring.entity.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassDao extends JpaRepository <ClassEntity, String> {
}
