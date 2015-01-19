package by.bntu.touragency.util;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class DateConvertion {

    public static Date convertStrToDate(String date, String pattern) {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        long temp = 0;
        try {
            temp = dateFormat.parse(date).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return new Date(temp);
        
    }
}
