package by.bntu.touragency.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfirmBookCommand implements Command {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String page = null;
		String free_places = request.getParameter("free_places");
		String tourId = request.getParameter("tourId");
		String amount = request.getParameter("amount");
		
		System.out.println(free_places + " " + tourId + " " + amount);
		return null;
	}

}
