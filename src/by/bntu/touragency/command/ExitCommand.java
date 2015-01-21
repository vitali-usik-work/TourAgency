package by.bntu.touragency.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.bntu.touragency.manager.ConfigurationManager;

public class ExitCommand implements Command {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String page = null;
		HttpSession session = request.getSession();
		
		if (session != null) {
			session.invalidate();
		}
		page = ConfigurationManager.getInstance().getProperty(
				ConfigurationManager.LOGIN_PAGE_PATH);
		return page;
	}

}
