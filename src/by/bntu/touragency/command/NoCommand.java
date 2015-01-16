package by.bntu.touragency.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import by.bntu.touragency.manager.ConfigurationManager;

import java.io.IOException;

/**
 * Class-command for redirecting to login page in the case of a direct appeal
 * to the controller
 * 
 */
public class NoCommand implements Command {

	/**
	 * @Override
	 * @see by.turbo.commands.Command#execute
	 */
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String page = ConfigurationManager.getInstance()
				.getProperty(ConfigurationManager.LOGIN_PAGE_PATH);
		return page;
	}

}