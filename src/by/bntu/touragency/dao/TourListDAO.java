package by.bntu.touragency.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import by.bntu.touragency.model.Tour;

public class TourListDAO {

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
						tour.setCountry(rs.getString("cost"));
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

}
