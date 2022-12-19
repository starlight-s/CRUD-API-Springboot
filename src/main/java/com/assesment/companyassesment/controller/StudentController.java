package com.assesment.companyassesment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.companyassesment.model.Student;
import com.assesment.companyassesment.model.StudentStatus;
import com.assesment.companyassesment.service.StudentService;



@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/AddStudent")
	public  StudentStatus addMobile(@RequestBody  Student s)
	{
		return studentService.addStudent(s);		
	}
	
	@GetMapping("/ShowStudent")
	public List<Student> showstudent()
	{
		return studentService.showstudent();
	}
	
	@PutMapping("/UpdateStudent")
	public StudentStatus updatevehicle(@RequestBody Student s)
	{
		return studentService.updatestudent(s);
	}	
	
	@DeleteMapping("/DeleteStudent/{id}")
	public StudentStatus removeMobile(@PathVariable int id)
	{
		return studentService.deletestudent(id);		
	}
}
