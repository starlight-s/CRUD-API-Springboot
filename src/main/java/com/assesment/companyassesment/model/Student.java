package com.assesment.companyassesment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	public int stud_id;
	public String name;
	public String address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stud_id, String name, String address) {
		super();
		this.stud_id = stud_id;
		this.name = name;
		this.address = address;
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	} 	
}
