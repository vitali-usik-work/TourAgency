package by.bntu.touragency.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import by.bntu.touragency.manager.ConfigurationManager;

public class DAOConnection {

	public static Connection connectToDB() {
Connection cn = null;
		
		try {
			String driver = ConfigurationManager.getInstance().getProperty(
					ConfigurationManager.DATABASE_DRIVER_NAME);
			Class.forName(driver);
			String url = ConfigurationManager.getInstance().getProperty(ConfigurationManager.DATABASE_URL);
				cn = DriverManager.getConnection(url);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cn;
	}

}
