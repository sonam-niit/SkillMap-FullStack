package com.niit.skillmap.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.niit.skillmap.entity.Employee;


@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	SessionFactory sessionFactory;
	public boolean addEmployee(Employee employee) {
		 sessionFactory.getCurrentSession().save(employee);
		 return true;
	}

	public boolean updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		return true;
	}

	public boolean deleteEmployee(int employeeId) {
		sessionFactory.getCurrentSession().delete(getEmployeeById(employeeId));
		return true;
	}

	public Employee getEmployeeById(int employeeId) {
		return (Employee)sessionFactory.getCurrentSession()
				.createQuery("from Employee where employeeId="+employeeId)
				.uniqueResult();
	}

	public List<Employee> getAllEmployeeDetails() {
		System.out.println("called");
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	public Employee getEmployeeByApproval(boolean flag) {
		return (Employee)sessionFactory.getCurrentSession()
				.createQuery("from Employee where status="+flag)
				.uniqueResult();
	}

	public boolean approveEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean validateEmployee(String employeeEmail, String employeePassword) {
		// TODO Auto-generated method stub
		return false;
	}

	/*public Employee validateEmployee(String employeeEmail, String employeePassword) {
		return (Employee)sessionFactory.getCurrentSession()
				.createQuery("from Employee where name='"+name+"'")
				.uniqueResult();
	}*/

}
