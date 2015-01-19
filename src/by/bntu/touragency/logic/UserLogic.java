package by.bntu.touragency.logic;

import java.util.List;

import by.bntu.touragency.dao.UserListDAO;
import by.bntu.touragency.model.User;

public class UserLogic {

    /**
     * @return
     */
    public static List<User> buildUserList() {
        List<User> userList = null;
        
        try {
            userList = UserListDAO.daoBuildUserList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }
}
