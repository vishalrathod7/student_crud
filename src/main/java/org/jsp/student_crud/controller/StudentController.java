package org.jsp.student_crud.controller;

import java.util.List;

import org.jsp.student_crud.dto.Student;
import org.jsp.student_crud.helper.ResponseStructure;
import org.jsp.student_crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
	@Autowired
	StudentService service;
	@PostMapping("student")
 public ResponseStructure<Student> saveStudent(@RequestBody Student student)
 {
		return service.saveStudent(student);
 } 
	@PostMapping("students")
 public ResponseStructure<List<Student>> saveStudents(@RequestBody List<Student> students)
 {
		return service.saveStudents(students);
 } 
	@GetMapping("student")
	public ResponseStructure<Student> findById(@RequestParam int id)
	{
		return service.findbyid(id); 
	}
	@GetMapping("studentname")
	public ResponseStructure<List<Student>> findByName(@RequestParam String name)
	{
		return service.findByName(name);
	}
	@GetMapping("findall")
	public ResponseStructure<List<Student>> findAll(){
		return service.findAll();
	}
}
