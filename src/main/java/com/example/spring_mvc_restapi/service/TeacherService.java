package com.example.spring_mvc_restapi.service;

import com.example.spring_mvc_restapi.dao.TeacherRepository;
import com.example.spring_mvc_restapi.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService implements TeacherServiceInterface {

    private TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository tRepository) {
        teacherRepository = tRepository;
    }

    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Teacher findById(int id) {
        Optional<Teacher> result = teacherRepository.findById(id);
        Teacher teacher = null;

        if (result.isPresent()) {
            teacher = result.get();
        } else {
            throw new RuntimeException("teacher with id " + id + "not found");
        }
        return teacher;
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public void deleteById(int id) {
        teacherRepository.deleteById(id);
    }
}
