package com.alshawi.home.bean;

import javax.annotation.ManagedBean;

import com.alshawi.home.nodes.Student;

@ManagedBean(value="studentBean")
public class StudentBean {

	private Student stu = new Student();

	public Student getStudent() {
		return stu;
	}

	public void setStudent(Student s) {
		this.stu = s;
	}
//	public void create()
//	{
//		ClassPathre
//	}
}
