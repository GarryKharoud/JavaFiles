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
public class JatinStringBreakLengthCut 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String a,b;
        System.out.println("Enter The First Word = ");
        a=s.nextLine();
        System.out.println("Enter The Second Word = ");
        b=s.nextLine();
        synchronized(System.in)
        {
            if(a.length()<=b.length())
            {
                for (int i=0;i<=a.length();i++)
                {
                    System.out.println(a.charAt(i));
                    System.out.println(b.charAt(i));
                    try 
                    {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException ex) 
                    {
                        Logger.getLogger(JatinStringBreakLengthCut.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else
            {
                for (int i = 0; i <=b.length(); i++) 
                {
                    System.out.println(a.charAt(i));
                    System.out.println(b.charAt(i));
                    try 
                    {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException ex) 
                    {
                        Logger.getLogger(JatinStringBreakLengthCut.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
}