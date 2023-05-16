package org.jsp.student_crud.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.student_crud.dto.Student;
import org.jsp.student_crud.helper.ResponseStructure;
import org.jsp.student_crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDao 
{
 @Autowired
 StudentRepository repository;

public Student saveStudent(Student student) {
	// TODO Auto-generated method stub
	 return repository.save(student);
}
public List<Student> saveStudents(List<Student> students) {
	// TODO Auto-generated method stub
	return repository.saveAll(students); 
}
public Student findById(int id) {
	// TODO Auto-generated method stub
  Optional<Student> op= repository.findById(id);
  if(op.isPresent())
  {
	  return op.get();
  }else
  {
	  return null;
  }
}
public ResponseStructure<List<Student>> findByName(String name) {
	// TODO Auto-generated method stub
	return repository.findByName(name);
}
public List<Student> findAll() {
	// TODO Auto-generated method stub
	return repository.findAll();
}
}
