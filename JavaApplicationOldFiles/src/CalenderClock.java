
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class CalenderClock {
    public static void main(String[] args) 
    {
        Calendar c=Calendar.getInstance();
        int m=c.get(Calendar.HOUR);
        int n=c.get(Calendar.MINUTE);
        int o=c.get(Calendar.SECOND);
        for (int i = m; i < 24; i++)
        {
            for (int j =n ; j < 60; j++) 
            {
                for (int k = o; k < 60; k++) 
                {
                    try 
                    {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException ex) 
                    {
                        Logger.getLogger(CalenderClock.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    m=0;
                    n=0;
                    o=0;
                    System.out.println(i+":"+j+":"+k);
                }
            }
        }
    }
}   