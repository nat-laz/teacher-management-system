package com.example.spring_mvc_restapi.dao;

import com.example.spring_mvc_restapi.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    List<Teacher> findAllByOrderByLastNameAsc();
}
