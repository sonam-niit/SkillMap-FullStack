package com.niit.skillmap.skillmapexample;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.skillmap.config.AppContext;
import com.niit.skillmap.entity.Employee;
import com.niit.skillmap.service.EmployeeService;


@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppContext.class)
public class AppTest {

	@Autowired
	EmployeeService employeeService;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/*@Test
	public void testAddEmployee() {
		Employee emp=new Employee();
		emp.setEmployeeId(2);
		emp.setEmployeeName("sonam");
		emp.setEmployeeEmail("sonam@gmail.com");
		emp.setEmployeeCity("mumbai");
		emp.setDate_of_joining(new Date());
		emp.setEmployeeCertification("ocjp");
		emp.setEmployeePhone("9022994222");
		emp.setEmployeeQualification("beit");
		emp.setEmployeeRole("employee");
		emp.setEmployeeSkill("java");
		emp.setEmployeePassword("sonam@123");
		emp.setStatus(false);
		
		assertEquals(true, employeeService.addEmployee(emp));
	}*/
/*	
	@Test
	public void testUpdateEmployee() {
		Employee emp=new Employee();
		emp.setEmployeeId(1);
		emp.setEmployeeName("sonam");
		emp.setEmployeeEmail("sonam@gmail.com");
		emp.setEmployeeCity("mumbai");
		emp.setDate_of_joining(new Date());
		emp.setEmployeeCertification("ocjp");
		emp.setEmployeePhone("8805503640");
		emp.setEmployeeQualification("beit");
		emp.setEmployeeRole("employee");
		emp.setEmployeeSkill("java");
		emp.setEmployeePassword("sonam@123");
		emp.setStatus(false);
		
		assertEquals(true, employeeService.updateEmployee(emp));
	}


/*	@Test
	public void testDeleteEmployee() {	
		assertEquals(true, employeeService.deleteEmployee(1));
	}
*/
	
	@Test
	public void testRetriveEmployee() {
		Employee emp=new Employee();
		Employee employee=employeeService.getEmployeeById(1);
		System.out.println(employee);
		assertEquals("",employeeService.getEmployeeById(1).getEmployeeId(),employee.getEmployeeId());
	}

	@Test
	public void testRetriveAllEmployee() {
		assertEquals(2,employeeService.getAllEmployeeDetails().size());
	}
	
}
