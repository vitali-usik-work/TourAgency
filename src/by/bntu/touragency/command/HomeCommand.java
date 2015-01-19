package by.bntu.touragency.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import org.apache.log4j.Logger;

import by.bntu.touragency.logic.TourLogic;
import by.bntu.touragency.manager.ConfigurationManager;
import by.bntu.touragency.model.Tour;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class-command check user for role, create Order table, Users table & 
 * Car table
 */
public class HomeCommand implements Command {

    private static org.apache.log4j.Logger logger = Logger.getLogger(HomeCommand.class);

	/**
	 * @Override
	 * @see by.turbo.commands.Command#execute
	 */
	
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String page = null;

		try {
			List<Tour> tourList = new ArrayList<Tour>();
			tourList = TourLogic.buildCarList();
			
			request.setAttribute("tourList", tourList);
			page = ConfigurationManager.getInstance().getProperty(
						ConfigurationManager.MAIN_PAGE_PATH);
			} catch (Exception e) {
				logger.error("Logic Technical Exception" + e);
			}

		return page;
	}
}