package by.bntu.touragency.logic;

import java.sql.Date;
import java.util.List;

import by.bntu.touragency.dao.TourDAO;
import by.bntu.touragency.model.Tour;

public class TourLogic {

	public static List<Tour> buildCarList() {
		List<Tour> tourList = null;
		
		try {
			tourList = TourDAO.daoBuildTourList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tourList;
	}

    public static List<Tour> buildMyTourList(int userId) {
        List<Tour> tourList = null;
        try {
            tourList = TourDAO.daoBuildMyTourList(userId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tourList;
    }

    public static void deleteTour(int tourId) {
        try {
            TourDAO.deleteTour(tourId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addTour(Double cost, String transport, Date date_from, Date date_to, String country, int hotel, String type_of_trip,
            int free_places) {
        try {
            TourDAO.addTour(cost, transport, date_from, date_to, country, hotel, type_of_trip, free_places);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
