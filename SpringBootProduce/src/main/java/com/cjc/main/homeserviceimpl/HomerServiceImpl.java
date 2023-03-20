package com.cjc.main.homeserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.homerepo.HomeRepository;
import com.cjc.main.homeservice.HomeService;
import com.cjc.main.model.Student;

@Service
public class HomerServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;
	
	public void savedata(Student s) {
		
		hr.save(s);
	}
	
}
