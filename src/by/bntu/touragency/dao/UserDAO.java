package by.bntu.touragency.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import by.bntu.touragency.model.User;

public class UserDAO {

    /**
     * @return
     */
    public static List<User> daoBuildUserList() {
        User user = null;
        List<User> userList = new ArrayList<User>();
        Connection cn = null;
        
        try {
            cn = DAOConnection.connectToDB();
            PreparedStatement st = null;
            
            try {
                st = cn.prepareStatement("SELECT * FROM user");
                ResultSet rs = null;
                
                try {
                    rs = st.executeQuery();
                    
                    while (rs.next()) { 
                        user = new User();
                        user.setId(rs.getInt("id"));
                        user.setSurname(rs.getString("surname"));
                        user.setName(rs.getString("name"));
                        user.setRole(rs.getString("role"));
                        user.setSum_of_trip(rs.getInt("sum_of_trip"));
                        user.setDiscount(rs.getInt("discount"));
                        userList.add(user);
                    }
                } finally{
                    rs.close();
                }

            } finally {
                if (st != null)
                    st.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (cn != null)
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return userList;
    }

    public static void deleteUser(int userId) {
        Connection cn = null;
        
        try {
            cn = DAOConnection.connectToDB();
            PreparedStatement st = null;
            
            try {
                st = cn.prepareStatement("DELETE FROM user WHERE id = ?");
                st.setInt(1, userId);
                st.executeUpdate();
            } finally {
                if (st != null)
                    st.close();
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (cn != null)
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

    public static void createUser(String surname, String name, String role, int i, int j) {
        Connection cn = null;
        
        try {
            cn = DAOConnection.connectToDB();
            PreparedStatement st = null;
            
            try {
                st = cn.prepareStatement("INSERT INTO user (surname, name, role, sum_of_trip, discount) VALUES (?, ?, ?, ?, ?);");
                st.setString(1, surname);
                st.setString(2, name);
                st.setString(3, role);
                st.setInt(4, i);
                st.setInt(5, j);
                st.executeUpdate();
            } finally {
                if (st != null)
                    st.close();
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (cn != null)
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

}
