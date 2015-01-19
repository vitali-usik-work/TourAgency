package by.bntu.touragency.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import by.bntu.touragency.model.Tour;

public class TourDAO {

    private static final String SQL_MY_TOUR_LIST = "SELECT * FROM tour JOIN book ON tour.id = book.tourId WHERE book.userId = ?;";
    
	public static List<Tour> daoBuildTourList() {
		Tour tour = null;
		List<Tour> tourList = new ArrayList<Tour>();
		Connection cn = null;
		
		try {
			cn = DAOConnection.connectToDB();
			PreparedStatement st = null;
			
			try {
				st = cn.prepareStatement("SELECT * FROM tour");
				ResultSet rs = null;
				
				try {
					rs = st.executeQuery();
					
					while (rs.next()) {	
						tour = new Tour();
						tour.setId(rs.getInt("id"));
						tour.setCost(rs.getDouble("cost"));
						tour.setTransport(rs.getString("transport"));
						tour.setDate_from(rs.getDate("date_from"));
						tour.setDate_to(rs.getDate("date_to"));
						tour.setCountry(rs.getString("country"));
						tour.setHotel(rs.getInt("hotel"));
						tour.setType_of_trip(rs.getString("type_of_trip"));
						tour.setFree_places(rs.getInt("free_places"));
						System.out.println("tour: " + tour.getId());
						tourList.add(tour);
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
		return tourList;
	}

    public static List<Tour> daoBuildMyTourList(int userId) {
        Tour tour = null;
        List<Tour> tourList = new ArrayList<Tour>();
        Connection cn = null;
        
        try {
            cn = DAOConnection.connectToDB();
            PreparedStatement st = null;
            
            try {
                st = cn.prepareStatement(SQL_MY_TOUR_LIST);
                st.setInt(1, userId);
                ResultSet rs = null;
                
                try {
                    rs = st.executeQuery();
                    
                    while (rs.next()) { 
                        tour = new Tour();
                        tour.setId(rs.getInt("id"));
                        tour.setCost(rs.getDouble("cost"));
                        tour.setTransport(rs.getString("transport"));
                        tour.setDate_from(rs.getDate("date_from"));
                        tour.setDate_to(rs.getDate("date_to"));
                        tour.setCountry(rs.getString("country"));
                        tour.setHotel(rs.getInt("hotel"));
                        tour.setType_of_trip(rs.getString("type_of_trip"));
                        tour.setFree_places(rs.getInt("free_places"));
                        System.out.println("tour: " + tour.getId());
                        tourList.add(tour);
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
        return tourList;
    }

    public static void deleteTour(int tourId) {
        Connection cn = null;
        
        try {
            cn = DAOConnection.connectToDB();
            PreparedStatement st = null;
            
            try {
                st = cn.prepareStatement("DELETE FROM tour WHERE id = ?");
                st.setInt(1, tourId);
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

    public static void addTour(Double cost, String transport, Date date_from, Date date_to, String country, int hotel, String type_of_trip,
            int free_places) {
        Connection cn = null;
        
        try {
            cn = DAOConnection.connectToDB();
            PreparedStatement st = null;
            
            try {
                st = cn.prepareStatement("INSERT INTO tour (cost, transport, date_from, date_to, country, hotel, type_of_trip, free_places) VALUES (?, ?, ?, ?, ?, ?, ?, ?);");
                st.setDouble(1, cost);
                st.setString(2, transport);
                st.setDate(3, date_from);
                st.setDate(4, date_to);
                st.setString(5, country);
                st.setInt(6,  hotel);
                st.setString(7, type_of_trip);
                st.setInt(8,  free_places);
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
