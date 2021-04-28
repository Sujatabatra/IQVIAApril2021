package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import com.sujata.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	public ArrayList<Employee> getEmployees() {
		Connection connection=null;
		ArrayList<Employee> empList=new ArrayList<Employee>();
		try {
			//1. Connect
			//1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			
			//2. statement : DQL (Data Query Language)
			PreparedStatement preparedStatement=connection.prepareStatement("select * from employees");
			ResultSet rs=preparedStatement.executeQuery();
			
			
			//3. Process the result
			while(rs.next()){
				
				int eid=rs.getInt("employee_id");
				String fname=rs.getString("first_name");
				String lname=rs.getString("last_name");
				String email=rs.getString("email");
				String phNo=rs.getString("phone_number");
				LocalDate hireDate=rs.getObject("hire_date",LocalDate.class);
				String jobId=rs.getString("job_id");
				int sal=rs.getInt("Salary");
				int comm=rs.getInt("Commission_pct");
				int mId=rs.getInt("manager_id");
				int depId=rs.getInt("department_id");
				
				Employee emp=new Employee(eid, fname, lname, email, phNo, hireDate, jobId, sal, comm, mId, depId);
				
				empList.add(emp);
				
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			//4.Close
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return empList;
	}

}
