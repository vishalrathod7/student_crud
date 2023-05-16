package org.jsp.student_crud.repository;

import java.util.List;

import org.jsp.student_crud.dto.Student;
import org.jsp.student_crud.helper.ResponseStructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{

	ResponseStructure<List<Student>> findByName(String name);
	List<Student> findAll();

}
