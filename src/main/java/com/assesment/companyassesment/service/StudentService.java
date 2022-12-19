package com.assesment.companyassesment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.companyassesment.dao.StudentDAO;
import com.assesment.companyassesment.model.Student;
import com.assesment.companyassesment.model.StudentStatus;

@Service
public class StudentService {
	@Autowired
	private StudentDAO studentDAO;
	
	public List<Student> showstudent() {
		return studentDAO.findAll();
	}
	
	public StudentStatus addStudent(Student s) {
		StudentStatus studentStatus =new 
				StudentStatus(0,"failed adding",new Student(0,"none","none"));
		if(!studentDAO.existsById(s.getStud_id()))
		{
				studentDAO.save(s);
				studentStatus.setCode(1);
				studentStatus.setMsg("Student added successfully");
				studentStatus.setStudent(s);
		}
		return studentStatus;
	}

	public StudentStatus updatestudent(Student s) {
		StudentStatus studentStatus = new StudentStatus(0,"Failed To Update",s);
		if(studentDAO.existsById(s.getStud_id()))
		{
			studentDAO.save(s);
			studentStatus.setMsg("Student Updated Succesfully");
			studentStatus.setCode(1);
			studentStatus.setStudent(s);
		}		
		return studentStatus;
	}

	public StudentStatus deletestudent(int id) {
		StudentStatus studentStatus =new 
				StudentStatus(0,"Student Not deleted",new Student(0,"none","none"));
		if(studentDAO.existsById(id))
		{
			studentDAO.deleteById(id);
			studentStatus.setCode(1);
			studentStatus.setMsg("Student removed successfully");
		}
		return studentStatus;
	}	
}
