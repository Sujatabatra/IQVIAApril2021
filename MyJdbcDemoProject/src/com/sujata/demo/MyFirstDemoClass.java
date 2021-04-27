package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyFirstDemoClass {

	public static void main(String[] args) {
		
		Connection connection=null;
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
				System.out.println(eid+"  "+fname+"  "+lname);
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

	}

}
