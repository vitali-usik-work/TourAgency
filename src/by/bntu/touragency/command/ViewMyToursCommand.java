package by.bntu.touragency.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import by.bntu.touragency.logic.TourLogic;
import by.bntu.touragency.manager.ConfigurationManager;
import by.bntu.touragency.model.Tour;

public class ViewMyToursCommand implements Command {

    private static org.apache.log4j.Logger logger = 
            Logger.getLogger(ViewMyToursCommand.class);
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = null;

        int userId = Integer.parseInt(request.getParameter("userId"));
        
        try {
            List<Tour> tourList = new ArrayList<Tour>();
            tourList = TourLogic.buildMyTourList(userId);
            
            request.setAttribute("tourList", tourList);
            page = ConfigurationManager.getInstance().getProperty(
                        ConfigurationManager.MY_TOURS_PAGE_PATH);
            } catch (Exception e) {
                logger.error("Logic Technical Exception" + e);
            }

        return page;
    }

}
