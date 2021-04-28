package com.sujata.client;

import java.util.Scanner;

import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;

public class EmployeeClient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeePresentation employeePresentation=new EmployeePresentationImpl();
		while(true){
			employeePresentation.showMenu();
			System.out.println("Enter choice ");
			int choice=sc.nextInt();
			employeePresentation.performMenu(choice);
		}

	}

}
