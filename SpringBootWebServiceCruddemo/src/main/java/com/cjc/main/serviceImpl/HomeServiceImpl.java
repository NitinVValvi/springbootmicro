package com.cjc.main.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.HomeRepository.HomeRepository;
import com.cjc.main.model.Employee;
import com.cjc.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeRepository hr;
	@Override
	public Employee saveEmpData(Employee emp) {
		return hr.save(emp);
		
	}
	@Override
	public List<Employee> displayAllData() {
		List<Employee> emplist = hr.findAll();
		return emplist;
	}
	@Override
	public Employee getEmp( int id) {
		
		return hr.findById(id).get();
		
	}

	@SuppressWarnings("deprecation")
	public void delete(int id) {
		
		Employee e = hr.getOne(id);
		
		hr.delete(e);
	}
	@Override
	public List<Employee> deleteEmpById(int id) {
		Employee emp = hr.findById(id).get();
		emp.setActive(false);
		hr.save(emp);
		List<Employee> allemp = hr.findAll();
		List<Employee> emlist =new ArrayList<Employee>();
		
		for(Employee e : allemp)
		{
			if(e.isActive())
			{
				emlist.add(e);
			}
		}
		
		return emlist;
	}

	

}
