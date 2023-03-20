package com.cjc.main.service;

import com.cjc.main.model.Employee;

public interface HomeService {

	public void SaveData(Employee emp);

	public Employee getEmpById(int empId);

}
