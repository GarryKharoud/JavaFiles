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
class kharoud extends Thread{
    public void run()
    {
        synchronized(System.in)
        {
            for(int i=51;i<=100;i++) 
            {
                try 
                {
                    Thread.sleep(100);
                    if(i%10==0)
                    {
                        System.in.notify();
                        System.in.wait();
                    }
                }
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(kharoud.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(i);
            }
        }   
    }
}
public class Loopdificult 
{
    public static void main(String[] args) 
    {
        kharoud n=new kharoud();
        n.start();
        synchronized(System.in)
        {
            for(int j=1;j<=50;j++) 
            {
                try 
                {
                    Thread.sleep(100);
                    if(j%10==0)
                    {
                        System.in.notify();
                        System.in.wait();
                    }
                }
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(Loopdificult.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(j);
            }
        }
    }
}

        