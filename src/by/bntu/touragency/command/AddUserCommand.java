package by.bntu.touragency.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.bntu.touragency.manager.ConfigurationManager;

public class AddUserCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String page = null;

        page = ConfigurationManager.getInstance().getProperty(
                ConfigurationManager.ADD_USER_PAGE_PATH);
        
        
        return page;
    }

}
