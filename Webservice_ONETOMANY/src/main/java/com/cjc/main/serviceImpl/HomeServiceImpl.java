package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Employee;
import com.cjc.main.repo.HomeRepositoy;
import com.cjc.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepositoy hr;
	@Override
	public void SaveData(Employee emp) {
		hr.save(emp);
		
	}
	@Override
	public Employee getEmpById(int empId) {
		
		return hr.getByEmpId(empId);

	}


}
