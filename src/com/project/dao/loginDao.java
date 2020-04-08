package com.project.dao;

import java.sql.*;
public class loginDao {
	String url="jdbc:mysql://localhost:3306/jspservletproject";
	String user="root";
	String password ="";
	String sql="select * from login where uname=? and pwd=?";
	public boolean check(String uname,String pwd)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(url, user, password);
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,uname);
			ps.setString(2,pwd);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				return true;
			}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	
	}
	

}
