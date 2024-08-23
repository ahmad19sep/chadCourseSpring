package com.corespring.chadspring;

import com.corespring.chadspring.JPACrud.entity.Dao.StudentDAO;
import com.corespring.chadspring.JPACrud.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ChadSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChadSpringApplication.class, args);
	}
@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return args -> {
			createStudent(studentDAO);
			//findStudentById(studentDAO);
			//findAllStudent(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);

		};
}

	private void deleteStudent(StudentDAO studentDAO) {
		studentDAO.delete(2);
		System.out.println("Deleted student");
	}

	private void updateStudent(StudentDAO studentDAO) {
		studentDAO.update(2);
		System.out.println("Student updated");
	}

	private void findAllStudent(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void createStudent(StudentDAO studentDAO) {
		Student student = new Student("Ali","Raza","raza@gmail.com");
studentDAO.save(student);

		System.out.println("Saved student Id: " + student.getId());

	}
	private void findStudentById(StudentDAO studentDAO) {
		Student student = studentDAO.findById(1);
		System.out.println("Found student : " + student.toString());
	}
}



