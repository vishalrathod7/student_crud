package org.jsp.student_crud.service;

import java.util.List;

import org.jsp.student_crud.dao.StudentDao;
import org.jsp.student_crud.dto.Student;
import org.jsp.student_crud.helper.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService 
{
	@Autowired
	StudentDao dao;
 public ResponseStructure<Student> saveStudent(Student student)
 {
	 student.setPercentage((student.getEnglish_marks()+student.getHindi_marks()+student.getMaths_marks())/3);
	 ResponseStructure<Student> structure=new ResponseStructure<>();
	structure.setMessage("Data Saved Succesfully");
	structure.setData(dao.saveStudent(student));
	structure.setCode(HttpStatus.CREATED.value()); 
	return structure;
	

 }
public ResponseStructure<List<Student>> saveStudents(List<Student> students) {
	// TODO Auto-generated method stub
	for(Student student:students)
	{
		student.setPercentage((student.getEnglish_marks()+student.getHindi_marks()+student.getMaths_marks())/3);
	}

	 ResponseStructure<List<Student>> structure=new ResponseStructure<>();
	structure.setMessage("Data Saved Succesfully");
	structure.setData(dao.saveStudents(students));
	structure.setCode(HttpStatus.CREATED.value()); 
	return structure;
}
public ResponseStructure<Student> findbyid(int id) {
	// TODO Auto-generated method stub
	Student student=dao.findById(id);
    ResponseStructure<Student> structure=new ResponseStructure<>();
    if(student==null)
    {
    	structure.setMessage("Data Not Found");
    	structure.setData(student);
    	structure.setCode(HttpStatus.FOUND.value());
    	
    }else
    {
     structure.setMessage("Data found");
     structure.setData(student);
     structure.setCode(HttpStatus.FOUND.value());
    }
    return structure;
}
public ResponseStructure<List<Student>> findByName(String name) 
{
	List<Student> list=(List<Student>) dao.findByName(name);
    ResponseStructure<List<Student>> structure=new ResponseStructure<>();
    if(list.isEmpty())
    {
    	structure.setMessage("Data Not Found");
    	structure.setData(null);
    	structure.setCode(HttpStatus.FOUND.value());
    	
    }else
    {
     structure.setMessage("Data found");
     structure.setData(list);
     structure.setCode(HttpStatus.FOUND.value());
    }
    return structure;
}
public ResponseStructure<List<Student>> findAll() {
	// TODO Auto-generated method stub
	List<Student> list=dao.findAll();
    ResponseStructure<List<Student>> structure=new ResponseStructure<>();
    if(list.isEmpty())
    {
    	structure.setMessage("Data Not Found");
    	structure.setData(null);
    	structure.setCode(HttpStatus.FOUND.value());
    	
    }else
    {
     structure.setMessage("Data found");
     structure.setData(list);
     structure.setCode(HttpStatus.FOUND.value());
    }
    return structure;
}	
}
