package by.bntu.touragency.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.bntu.touragency.logic.LoginLogic;
import by.bntu.touragency.logic.TourLogic;
import by.bntu.touragency.manager.ConfigurationManager;
import by.bntu.touragency.model.Tour;
import by.bntu.touragency.model.User;

public class LoginCommand implements Command {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String page = null;
		// extraction of login & password
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String role = null;

		// login and password check
		try {
			User user = LoginLogic.checkLogin(name, surname);
			
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			page = ConfigurationManager.getInstance().getProperty(
					ConfigurationManager.MAIN_PAGE_PATH);
			
			try {
				List<Tour> tourList = new ArrayList<Tour>();
				tourList = TourLogic.buildCarList();
				
				request.setAttribute("tourList", tourList);
				if(null != user) {
					page = ConfigurationManager.getInstance().getProperty(
							ConfigurationManager.MAIN_PAGE_PATH);
				} else {
					page = ConfigurationManager.getInstance().getProperty(ConfigurationManager.LOGIN_PAGE_PATH);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception ex ) {
			request.setAttribute("invalidLogin","invalid logi");
			page = ConfigurationManager.getInstance().getProperty(
					ConfigurationManager.LOGIN_PAGE_PATH);
		}
		return page;
	}

}
