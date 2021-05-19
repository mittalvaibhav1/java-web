package com.LoginApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	String url = "jdbc:mysql://localhost:3306/LoginApp";
	String username = "root";
	String password = "makeway";
	public boolean checkCredentials(String uname, String pass){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			String query = "select * from users where uname=? and pass=?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			if(rs.next()) return true;
		}
		catch(ClassNotFoundException ex) {
			System.out.println("Unable to load the driver!");
		}
		catch(SQLException ex) {
			System.out.println("Unable to connect to db");
		}
		return false;
	}
}
