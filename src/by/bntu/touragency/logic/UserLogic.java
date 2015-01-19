package by.bntu.touragency.logic;

import java.util.List;

import by.bntu.touragency.dao.UserDAO;
import by.bntu.touragency.model.User;

public class UserLogic {

    /**
     * @return
     */
    public static List<User> buildUserList() {
        List<User> userList = null;
        
        try {
            userList = UserDAO.daoBuildUserList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }

    public static void deleteUser(int userId) {
        try {
            UserDAO.deleteUser(userId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addUser(String surname, String name, String role, int i, int j) {
        try {
            UserDAO.createUser(surname, name, role, 0, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
