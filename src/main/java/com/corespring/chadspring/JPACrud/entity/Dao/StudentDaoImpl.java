package com.corespring.chadspring.JPACrud.entity.Dao;

import com.corespring.chadspring.JPACrud.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDAO {
    private EntityManager entityManager;

    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;

    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    @Transactional
    public void update(int id) {

        Student student = entityManager.find(Student.class, id);
        student.setEmail("abcd@gmail.com");
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(int id) {
        TypedQuery<Student> query=entityManager.createQuery("delete from Student where id=:id", Student.class);
        query.setParameter("id", id);
        query.executeUpdate();

    }

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query=entityManager.createQuery("from Student ", Student.class);
        return query.getResultList();
    }
}
