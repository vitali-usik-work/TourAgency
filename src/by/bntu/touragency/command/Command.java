package by.bntu.touragency.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

/**
 * An interface that defines the contract and its implementation
 */

public interface Command {

	/**
	 * Execute command
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public String execute(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException;

}
