package by.bntu.touragency.logic;

import java.util.List;

import by.bntu.touragency.dao.TourListDAO;
import by.bntu.touragency.model.Tour;

public class TourLogic {

	public static List<Tour> buildCarList() {
		List<Tour> tourList = null;
		
		try {
			tourList = TourListDAO.daoBuildTourList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tourList;
	}

    public static List<Tour> buildMyTourList(int userId) {
        List<Tour> tourList = null;
        try {
            tourList = TourListDAO.daoBuildMyTourList(userId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tourList;
    }

}
