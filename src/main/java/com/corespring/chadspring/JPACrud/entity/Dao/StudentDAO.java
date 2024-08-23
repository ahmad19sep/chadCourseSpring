package com.corespring.chadspring.JPACrud.entity.Dao;

import com.corespring.chadspring.JPACrud.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);
    void update(int id);
    void delete(int id);
    Student findById(int id);
    List<Student> findAll();

}
