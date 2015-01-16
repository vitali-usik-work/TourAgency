package by.bntu.touragency.logic;

import java.util.List;

import by.bntu.touragency.dao.TourListDAO;
import by.bntu.touragency.model.Tour;

public class TourLogic {

	public static List<Tour> buildCarList() {
		List<Tour> carList = null;
		
		try {
			carList = TourListDAO.daoBuildTourList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return carList;
	}

}
