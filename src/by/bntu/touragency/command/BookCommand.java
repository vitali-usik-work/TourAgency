package by.bntu.touragency.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.bntu.touragency.manager.ConfigurationManager;

public class BookCommand implements Command {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String page = null;
		String free_places = request.getParameter("free_places");
		String tourId = request.getParameter("tourId");
		
		request.setAttribute("tourId", tourId);
		request.setAttribute("free_places", free_places);

		page = ConfigurationManager.getInstance().getProperty(
				ConfigurationManager.CONFIRM_BOOK_PAGE_PATH);
		
		
		return page;
	}

}
