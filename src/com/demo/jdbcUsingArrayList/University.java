package com.demo.jdbcUsingArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class University {
public static void main(String[] args) {
	College clg=new College();
	ArrayList<Student> al1=clg.allData();
	
	/*for(Student st:al1)
	{
		System.out.println(st.getRollno());
		System.out.println(st.getName());
	}*/
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Suhas");
		
		String sql="insert into studentdata values(?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		for(Student st:al1)
		{
			ps.setInt(1, st.getRollno());
			ps.setString(2, st.getName());
			ps.executeUpdate();
			
		}
		System.out.println("record inserted successfully......");
			
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
