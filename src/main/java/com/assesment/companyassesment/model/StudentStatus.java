package com.assesment.companyassesment.model;

public class StudentStatus {
	public int code;
	public String msg;
	public Student student;
	
	public StudentStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentStatus(int code, String msg, Student student) {
		super();
		this.code = code;
		this.msg = msg;
		this.student = student;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}	
}
