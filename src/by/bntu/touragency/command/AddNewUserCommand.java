package by.bntu.touragency.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.bntu.touragency.logic.UserLogic;
import by.bntu.touragency.manager.ConfigurationManager;

public class AddNewUserCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String page = null;
        // extraction of login & password
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String role = request.getParameter("role");

        // login and password check
        try {
            UserLogic.addUser(surname, name, role, 0, 0);
            request.setAttribute("successMessage" , "User created");
            page = ConfigurationManager.getInstance().getProperty(
                    ConfigurationManager.SUCCESS_PAGE_PATH);
            
        } catch (Exception ex ) {
            request.setAttribute("invalidLogin","invalid logi");
            page = ConfigurationManager.getInstance().getProperty(
                    ConfigurationManager.LOGIN_PAGE_PATH);
        }
        return page;
    }

}
