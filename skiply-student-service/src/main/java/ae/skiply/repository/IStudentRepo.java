package ae.skiply.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ae.skiply.model.Student;

public interface IStudentRepo extends JpaRepository<Student, Long> {

}
