package by.bntu.touragency.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.bntu.touragency.logic.ConfirmBookLogic;
import by.bntu.touragency.manager.ConfigurationManager;

public class ConfirmBookCommand implements Command {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String page = null;
		int free_places = Integer.parseInt(request.getParameter("free_places"));
		String tourId = request.getParameter("tourId");
		int amount = Integer.parseInt(request.getParameter("amount"));
		String userId = request.getParameter("userId");
		
		System.out.println(free_places + " " + tourId + " " + amount);
		try {
            if(free_places > amount) {
                ConfirmBookLogic.confirmBook(tourId, userId, amount, free_places);
                request.setAttribute("successMessage" , "The tour is booked");
                page = ConfigurationManager.getInstance().getProperty(
                        ConfigurationManager.SUCCESS_PAGE_PATH);
            } else {
                request.setAttribute("errorMessage","no more tickets");
                page = ConfigurationManager.getInstance().getProperty(ConfigurationManager.ERROR_PAGE_PATH);
            }
		} catch (Exception ex ) {
            request.setAttribute("invalidLogin","invalid logi");
            page = ConfigurationManager.getInstance().getProperty(
                    ConfigurationManager.LOGIN_PAGE_PATH);
        }
		return page;
	}

}
