package com.cjc.main.homeserviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.homerepository.HomeRepository;
import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;

	@Override
	public Student saveStuData(Student s) {
		return hr.save(s);
		
	}

	public Student logincheck(String username, String password) {
		
		return hr.findByUsernameAndPassword(username, password);
	}

	public Iterable<Student> StuAllData() {
		
		return hr.findAll();
	}

	@Override
	public Student getSingleEmp(String username, String password) {
		
		return hr.findByUsernameAndPassword(username, password);
	}

	@Override
	public List<Student> deleteStuBySid(int sid) {
		
		Student stu = hr.findById(sid).get();
		stu.setActive(false);
		hr.save(stu);
		List<Student> allstu = hr.findAll();
		List<Student> stulist = new ArrayList<Student>();
		for (Student student : allstu) {
			if(student.isActive)
			{
				stulist.add(student);
			}
		}
		
		return stulist;
	}

	@Override
	public Student getStu(int sid) {
		
		return hr.findBySid(sid);
	}
	
}
