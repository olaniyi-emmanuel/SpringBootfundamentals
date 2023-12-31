package com.olaniyi.Controller;

import java.util.ArrayList;
import java.util.List;

import com.olaniyi.beans.Student;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.olaniyi.Controller"})
@RestController
public class StudentController {
	
	public static List<Student> students = new ArrayList<Student>(); 
	
	public StudentController() {
		students.add(new Student("Emmanuel", "Olaniyi"));
		students.add(new Student("Tope", "Olatuji"));
		students.add(new Student("John", "Smith"));
		students.add(new Student("Goodluck", "Jonathan"));
		students.add(new Student("Alexis", "Sanchex"));
	}
	
	//http://localhost:8080/student
	@GetMapping("/student")
	public List<Student> getStudent() {
		return students;
	}
	
	//http://localhost:8080/student/olaniyi/bola
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	//http://localhost:8080/student/query?firstName=olaniyi&lastName=bola
	@GetMapping("student/query")
	public Student studentQueryParam(@RequestParam(name="firstName") String firstName,
			@RequestParam(name="lastName") String lastName) {
		return new Student (firstName, lastName);
	}
	
	@PostMapping("/student")
	public void addStudent(@RequestBody Student student) {
		students.add(student);
	}

}
