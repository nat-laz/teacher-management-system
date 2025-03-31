package com.example.spring_mvc_restapi.service;

import com.example.spring_mvc_restapi.model.Teacher;

import java.util.List;

public interface TeacherServiceInterface {

    List<Teacher> findAll();

    Teacher findById(int id);

    Teacher save(Teacher teacher);

    void deleteById(int id);
}
