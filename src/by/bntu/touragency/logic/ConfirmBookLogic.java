package by.bntu.touragency.logic;

import by.bntu.touragency.dao.ConfirmBookDAO;

public class ConfirmBookLogic {

  public static void confirmBook(String tourId, String userId, int amount, int free_places) {

    try {
      int tour = Integer.parseInt(tourId);
      int user = Integer.parseInt(userId);
      ConfirmBookDAO.daoConfirmBook(tour, user, amount, free_places);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
