package SBRestAPIWithCRUDOperation.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import SBRestAPIWithCRUDOperation.entities.Student;
import SBRestAPIWithCRUDOperation.repository.StudentRepository;

@RestController
public class StudentController {
//get all the student
	@Autowired
	StudentRepository repo;
	@GetMapping("/Students")
	private List<Student> getAllStudents(){
		List<Student> students = repo.findAll();
		return students;
	}
	@GetMapping("/Students/{id}")
	public Student getStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		
		return student;
	}
	@PostMapping("/student/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createStudent(@RequestBody Student student) {
		Student sav = repo.save(student);
		System.out.println(sav);
	}
	
	@PutMapping("/student/Update/{id}")
	public Student updatestudents(@PathVariable int id) {
		Student student = repo.findById(id).get();
		student.setName("Nandni Singh");
		student.setPercentage(59.0f);
		repo.save(student);
		return student;
	}
	
	@DeleteMapping("/student/delete/{id}")
	public void removestudent(@PathVariable int id) {
		Student student=repo.findById(id).get();
		repo.delete(student);
	}
	
}
