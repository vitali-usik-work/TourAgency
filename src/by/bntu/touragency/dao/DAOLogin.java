package by.bntu.touragency.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import by.bntu.touragency.model.User;

public class DAOLogin {

	private static final String SQL_CHECK_LOGIN = "SELECT * FROM USER WHERE surname = ? AND name = ?";

	public static User daoCheckLogin(String name, String surname) {
		User user = null;
		// checking login & password
		Connection cn = null;
		
		try {
			cn = DAOConnection.connectToDB();
			PreparedStatement st = null;
			
			try {
				st = cn.prepareStatement(SQL_CHECK_LOGIN);
				st.setString(1, surname);
				st.setString(2, name);
				ResultSet rs = null;
				
				try {
					rs = st.executeQuery();
					// checking whether the user with the given login & password
					if(rs.next()){
						user = new User();
						user.setId(rs.getInt("id"));
						user.setName(rs.getString("name"));
						user.setSurname(rs.getString("surname"));
						user.setRole(rs.getString("role"));
						user.setSum_of_trip(rs.getInt("sum_of_trip"));
						user.setDiscount(rs.getInt("discount"));
						System.out.println(user.getName() + user.getRole());
					} else {
						
					}
				} finally{
					rs.close();
				}
			} finally {
				if (st != null)
					st.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (cn != null)
				try {
					cn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return user;
	}

}
