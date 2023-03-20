package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService {
@Autowired
	HomeRepository hr;
	
	@Override
	public void saveData(Student s) {
		Long mobno = s.getMobno();
		Student stu = hr.findByMobno(mobno);
		if(stu==null)
		{
			hr.save(s);
		}
		else
		{
			System.out.println("record already exists");
		}
		
	}

	@Override
	public Student logincheck(String username, String password) {
		
		return hr.findByUsernameAndPassword(username, password);
	}

	@Override
	public Iterable<Student> displayAllData() {
		
		return hr.findAll();
	}

	@Override
	public void deleteRecord(int uid) {
		hr.deleteById(uid);
		
	}

	@Override
	public Student editPage(int uid) {
		
		return hr.findByUid(uid);
	}

	

	
}
