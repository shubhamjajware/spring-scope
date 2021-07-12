package com.codermantra.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public class School {
	
	@Autowired
	private Student student; //prototype
	
	public School() {
		System.out.println("School constructor object instatiate");
	}
	
	//Use of lookup to call CGLib 
	@Lookup
	Student createStudentObject() {
		
		return null;
	}
	
	public Student getStudent() {
		Student student = createStudentObject();
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
