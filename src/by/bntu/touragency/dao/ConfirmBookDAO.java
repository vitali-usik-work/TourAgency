package by.bntu.touragency.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConfirmBookDAO {

    public static void daoConfirmBook(int tourId, int userId, int amount, int free_places) {
        Connection cn = null;
        
        try {
            cn = DAOConnection.connectToDB();
            PreparedStatement st = null;
            
            try {
                st = cn.prepareStatement("INSERT INTO book (tourId, userId, amount) VALUES (?, ?, ?);");
                st.setInt(1, tourId);
                st.setInt(2, userId);
                st.setInt(3, amount);
                st.executeUpdate();
            } finally {
                if (st != null)
                    st.close();
            }
            
            try {
                int i = free_places - amount;
                System.out.println(i);
                st = cn.prepareStatement("UPDATE tour SET free_places = ? WHERE id = ?;");
                st.setInt(1, i);
                st.setInt(2, tourId);
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
