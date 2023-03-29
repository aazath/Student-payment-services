package ae.skiply.service;

import java.util.List;

import ae.skiply.model.Student;

public interface IStudentService {
	Student saveStudent(Student student); 
	List<Student> getAllStudent(); 
	Student getStudentById(Long sid);
	Student updateStudent(Student student, Long sid);
	void deleteStudentById(Long sid);
}
