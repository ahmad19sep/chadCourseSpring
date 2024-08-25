package com.corespring.chadspring.restController;

import com.corespring.chadspring.StudentRestPojo.Student;
import com.corespring.chadspring.exceptionHandler.StudentErrorResponse;
import com.corespring.chadspring.exceptionHandler.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestService {



    //getting all the students
    @GetMapping("/students")
    public List<Student> getStudents() {
        return students();

    }


    //Getting student by their id's

    @GetMapping("/student/{StudentId}")
    public Student getStudent(@PathVariable int StudentId) {

        if (StudentId < 0 || StudentId > students().size()-1) {
            throw new StudentNotFoundException("Student id not found : " + StudentId);

        }
        return students().get(StudentId);
    }

    private static List<Student> students() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(
                new Student("Ahmad", "Siddique", 23));
        studentList.add(
                new Student("Ali", "raza", 25));
        studentList.add(
                new Student("Nabeel", "ahmad", 23));
        studentList.add(
                new Student("naseer", "hussain", 23));

        return studentList;
    }
}