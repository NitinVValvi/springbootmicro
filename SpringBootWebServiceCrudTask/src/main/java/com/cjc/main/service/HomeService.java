package com.cjc.main.service;

import java.util.List;

import com.cjc.main.model.Student;

public interface HomeService {

	public Student saveStuData(Student s);

	public Student logincheck(String username, String password);

	public Iterable<Student> StuAllData();

	public Student getSingleEmp(String username, String password);

	public List<Student> deleteStuBySid(int sid);

	public Student getStu(int sid);

	

}
