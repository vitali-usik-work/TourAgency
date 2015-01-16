package by.bntu.touragency.logic;

import by.bntu.touragency.dao.DAOLogin;
import by.bntu.touragency.model.User;

public class LoginLogic {

	public static User checkLogin(String login, String password) {
		
		User user = null;
		
		try {
			user = DAOLogin.daoCheckLogin(login, password);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return user;	
	}
	
}
