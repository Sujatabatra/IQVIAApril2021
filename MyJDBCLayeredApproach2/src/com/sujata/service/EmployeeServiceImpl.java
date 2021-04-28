package com.sujata.service;

import java.util.ArrayList;

import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	public ArrayList<Employee> getAllEmployees() {
		
		return employeeDao.getEmployees();
	}

	public boolean insertEmployee(Employee employee) {
		return employeeDao.insertRecord(employee);
	}

	public boolean deleteEmployee(int empId) {
		return employeeDao.deleteRecord(empId);
	}

}
