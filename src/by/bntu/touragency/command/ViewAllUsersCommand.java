package by.bntu.touragency.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import by.bntu.touragency.logic.UserLogic;
import by.bntu.touragency.manager.ConfigurationManager;
import by.bntu.touragency.model.User;

/**
 * Command for Viewing all users
 */
public class ViewAllUsersCommand implements Command {

    private static org.apache.log4j.Logger logger = Logger.getLogger(ViewAllUsersCommand.class);
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String page = null;

        try {
            List<User> userList = new ArrayList<User>();
            userList = UserLogic.buildUserList();
            
            request.setAttribute("userList", userList);
            page = ConfigurationManager.getInstance().getProperty(
                        ConfigurationManager.ALL_USERS_PAGE_PATH);
            } catch (Exception e) {
                logger.error("Logic Technical Exception" + e);
            }

        return page;
    }

}
