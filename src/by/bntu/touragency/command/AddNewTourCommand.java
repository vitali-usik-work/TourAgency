package by.bntu.touragency.command;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;




import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.bntu.touragency.logic.TourLogic;
import by.bntu.touragency.manager.ConfigurationManager;
import by.bntu.touragency.util.DateConvertion;

public class AddNewTourCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String page = null;
        // extraction of login & password
        Double cost = Double.parseDouble(request.getParameter("cost"));
        String transport = request.getParameter("transport");
        
        
//        String string = "January 2, 2010";
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date_from = null;
        Date date_to = null;

        date_from = DateConvertion.convertStrToDate(request.getParameter("date_from"), "yyyy-MM-dd");
        date_to = DateConvertion.convertStrToDate(request.getParameter("date_to"), "yyyy-MM-dd");
//        try {
//            date_from = format.parse(request.getParameter("date_from"));
//            date_to = format.parse(request.getParameter("date_from"));
//        } catch (ParseException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        //System.out.println(date); // Sat Jan 02 00:00:00 GMT 2010
        
        //String date_from = request.getParameter("date_from");
        
        //String date_to = request.getParameter("date_to");
        String country = request.getParameter("country");
        int hotel = Integer.parseInt(request.getParameter("hotel"));
        String type_of_trip = request.getParameter("type_of_trip");
        int free_places = Integer.parseInt(request.getParameter("free_places"));

        try {
            TourLogic.addTour(cost, transport, date_from, date_to, country, hotel, type_of_trip, free_places);
            request.setAttribute("successMessage" , "Tour created");
            page = ConfigurationManager.getInstance().getProperty(
                    ConfigurationManager.SUCCESS_PAGE_PATH);
            
        } catch (Exception ex ) {
            request.setAttribute("invalidLogin","invalid logi");
            page = ConfigurationManager.getInstance().getProperty(
                    ConfigurationManager.LOGIN_PAGE_PATH);
        }
        return page;
    }

}
