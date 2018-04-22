package com.niit.skillmap.rest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.skillmap.entity.Employee;
import com.niit.skillmap.service.EmployeeService;



@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public ResponseEntity<List<Employee>> listAllEmployees() {
		
		return new ResponseEntity<List<Employee>>(employeeService.getAllEmployeeDetails(), HttpStatus.CREATED);
	}
	
	@GetMapping("/{empId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("empId") int empId) {
		
		if(employeeService.getEmployeeById(empId)!=null) {
			return new ResponseEntity<Employee>(employeeService.getEmployeeById(empId), HttpStatus.OK);
		}
		else 
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND); 
	}
	
	@DeleteMapping("/{empId}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("empId") int empId) {
		
		if(employeeService.getEmployeeById(empId)!=null) {
			employeeService.deleteEmployee(empId);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); 
	}
	
	@PostMapping
	public ResponseEntity<Void> addEmployee(@RequestBody Employee employee) {
		
		if(employeeService.getEmployeeById(employee.getEmployeeId())!=null) {
			
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		else {
			employeeService.addEmployee(employee);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
	}
	
/*	@PutMapping
	public ResponseEntity<Void> updateEmployee(@RequestBody Employee employee) {
		
		if(employeeService.getEmployeeById(employee.getEmployeeName()!=null)){
			employeeService.updateEmployee(employee);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		else {
			
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	*/
	
	
}
