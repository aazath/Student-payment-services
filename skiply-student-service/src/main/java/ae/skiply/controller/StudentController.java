package ae.skiply.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ae.skiply.model.Student;
import ae.skiply.service.IStudentService;

@RestController
@RequestMapping("api/students")
public class StudentController {

	@Autowired
	private IStudentService studentService;

	// Create Student Rest API
	@PostMapping
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
	}

	// get All Students Rest API
	@GetMapping
	public List<Student> getAllStudents() {
		return studentService.getAllStudent();
	}

	// get Student by Id Rest API
	@GetMapping("{sid}")
	public ResponseEntity<Student> getStudentById(@PathVariable("sid") Long studentId) {
		return new ResponseEntity<Student>(studentService.getStudentById(studentId), HttpStatus.OK);
	}

	// update Student by Id Rest API
	@PutMapping("{sid}")
	public ResponseEntity<Student> updateStudent(@PathVariable("sid") Long studentId, @RequestBody Student student) {
		return new ResponseEntity<Student>(studentService.updateStudent(student, studentId), HttpStatus.OK);
	}
	
	//delete Student by Id Rest API
	@DeleteMapping("{sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable("sid") Long sid){
		
		studentService.deleteStudentById(sid);
		return new ResponseEntity<String>("Student deleted successfully.", HttpStatus.OK);
	}

}
