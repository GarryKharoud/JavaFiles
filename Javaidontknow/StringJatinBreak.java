/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hp
 */
public class StringJatinBreak extends Thread {
    public static String a,b,d[];
    public void run()
    {
        synchronized(System.in)
        {
            d=b.split("");
            for (int j = 0; j < b.length(); j++) 
            {
                try 
                {
                    System.out.println(d[j]);
                    Thread.sleep(100);
                    System.in.notify();
                    System.in.wait();
                }
                catch (InterruptedException ex)
                {
                    
                }
            }
            System.in.notify();
        }
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter The First Word = ");
        a=s.nextLine();
        System.out.print("Enter The Second Word = ");
        b=s.nextLine();
        StringJatinBreak k=new StringJatinBreak();
        k.start();
        synchronized(System.in)
        {
            String c[]=a.split("");
            for (int i=0;i<a.length();i++) 
            {
                try
                {
                    System.out.println(c[i]);
                    Thread.sleep(100);
                    System.in.notify();
                    System.in.wait();
                }
                catch (InterruptedException ex)
                {
                    
                }
            }
            System.in.notify();
            
        }
        k.stop();
    }
}