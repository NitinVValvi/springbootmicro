package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.homerepo.HomeRepository;
import com.cjc.main.model.Customer;
import com.cjc.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;
	@Override
	public void saveData(Customer c) {
		hr.save(c);
	}

}
