package ae.skiply.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ae.skiply.exception.ResourceNotFoundException;
import ae.skiply.model.Student;
import ae.skiply.repository.IStudentRepo;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepo studentRepo;

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	@Override
	public Student getStudentById(Long sid) {
		return studentRepo.findById(sid).orElseThrow(() -> new ResourceNotFoundException("Student", "sid", sid));
	}

	@Override
	public Student updateStudent(Student student, Long sid) {
		// Check whether the student with the Id exists nor not
		Student existingStudent = studentRepo.findById(sid)
				.orElseThrow(() -> new ResourceNotFoundException("Student", "sid", sid));
		// update the values
		existingStudent.setStudent_name(student.getStudent_name());
		existingStudent.setGrade(student.getGrade());
		existingStudent.setMobile_no(student.getMobile_no());
		existingStudent.setSchool_name(student.getSchool_name());
		// save student with updated values
		studentRepo.save(existingStudent);
		return existingStudent;
	}

	@Override
	public void deleteStudentById(Long sid) {
		// Check whether the student with the Id exists nor not
				Student existingStudent = studentRepo.findById(sid)
						.orElseThrow(() -> new ResourceNotFoundException("Student", "sid", sid));
		//Delete the student 
		studentRepo.deleteById(sid);
	}

}
