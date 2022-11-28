/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ThreadFunction extends Thread{
    public void run()
    {
         for (int i = 50; i <= 100; i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(500);
                    
                
            } catch (Exception e) 
            {
                
            }
        }
    }
    public static void main(String[] args) {
        ThreadFunction r=new ThreadFunction();
        r.start();
        Scanner s=new Scanner(System.in);
         for (int i = 0; i < 50; i++) 
        {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) 
            {
                
            }
        }
       
    
    }
}
