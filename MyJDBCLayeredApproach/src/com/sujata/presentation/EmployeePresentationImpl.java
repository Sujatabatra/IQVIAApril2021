package com.sujata.presentation;

import java.util.ArrayList;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	public void showMenu() {
		System.out.println("1. Show All Employees");
		System.out.println("2. Exit");

	}

	public void performMenu(int choice) {
		switch(choice){
		case 1:
			ArrayList<Employee> employees=employeeService.getAllEmployees();
			for(Employee employee:employees){
				System.out.println(employee);
			}
		break;
		case 2:
			System.out.println("Thanks for using Employee Management System! Have a Nice Day!");
			System.exit(0);
			
		}

	}

}
