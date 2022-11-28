/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hp
 */
class loophole extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex) 
        {
            Logger.getLogger(loophole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
public class Loop1To100Difficult {
    public static void main(String[] args) 
    {
        
        for (int h=0;h<=10;h++)
        {
            loophole n=new loophole();
            n.start();
                
            for (int i=1;i<=50;i++) 
            {
                System.out.println(i);
            }
            n.stop();
            for (int i=51;i<=100;i++)
            {
                System.out.println(i);
            }
        }
    }
}