/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import myfitbit.Fitbit;
import myfitbit.Fitbit_Decorder;
import myfitbit.GetHR;
import myfitbit.MySQLConnector;
import myfitbit.config;
import org.json.JSONException;

/**
 *
 * @author Chili
 */
public class Task extends TimerTask {
   
    public void run()   {
        
        String user = "YZUACCHC17@gmail.com";
        Date date = new Date();

        try {
                    SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat DateFormat = new SimpleDateFormat("HH:mm:ss");
        String StartDate = bartDateFormat.format(date);
        String EndTime = DateFormat.format(date);  
        Calendar cal = Calendar.getInstance();
        cal.setTime(DateFormat.parse(EndTime));
        cal.add(Calendar.MINUTE, -20);
          String StartTime = DateFormat.format(cal.getTime());
          Fitbit.main(user, StartDate, StartTime, EndTime, "HR", "", StartDate, "1min");
         // Fitbit.main(user, StartDate, StartTime, EndTime, "ACTIVITY", "steps", StartDate, "1min");
        } catch (SQLException ex) {
            Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (ParseException ex) {
            Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
