package com.assesment.companyassesment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.assesment.companyassesment.model.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer> {

}
