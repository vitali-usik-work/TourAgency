package by.bntu.touragency.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.bntu.touragency.logic.TourLogic;
import by.bntu.touragency.manager.ConfigurationManager;

public class DeleteTourCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String page = null;
        int tourId = Integer.parseInt(request.getParameter("tourId"));

        try {
            TourLogic.deleteTour(tourId);
            request.setAttribute("successMessage" , "Tour deleted");
            page = ConfigurationManager.getInstance().getProperty(ConfigurationManager.SUCCESS_PAGE_PATH);

        } catch (Exception ex) {
            request.setAttribute("invalidLogin", "invalid logi");
            page = ConfigurationManager.getInstance().getProperty(ConfigurationManager.LOGIN_PAGE_PATH);
        }
        return page;
    }

}
