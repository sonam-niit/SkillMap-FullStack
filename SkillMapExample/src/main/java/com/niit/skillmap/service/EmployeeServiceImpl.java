package com.niit.skillmap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.niit.skillmap.dao.EmployeeDao;
import com.niit.skillmap.entity.Employee;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	public boolean addEmployee(Employee employee) {
		
		return employeeDao.addEmployee(employee);	
		
	}
	public boolean updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}
	public boolean deleteEmployee(int employeeId) {
		return employeeDao.deleteEmployee(employeeId);
	}
	public Employee getEmployeeById(int employeeId) {
		return employeeDao.getEmployeeById(employeeId);
	}
	public List<Employee> getAllEmployeeDetails() {
		return employeeDao.getAllEmployeeDetails();
	}

}
