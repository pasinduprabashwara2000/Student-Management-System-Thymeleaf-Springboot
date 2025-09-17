package edu.ijse.layered.spring.dao;

import edu.ijse.layered.spring.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository <CourseEntity, String> {

}
