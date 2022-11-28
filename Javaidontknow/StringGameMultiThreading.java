/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class StringGameMultiThreading extends Thread{
    public void run()
    {
        try 
            {
                Thread.sleep(60000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        System.out.println("Total Score = "+z);
        System.exit(0);
    }
    static int z=0;
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         StringGameMultiThreading t=new StringGameMultiThreading();
         t.start();
       
        for (boolean i=true;i!=false;) 
        {
            System.out.println("Enter The Number = ");
            int k;
            k=s.nextInt(); 
            Random g=new Random();
            int h=g.nextInt(1+9);
            System.out.println(h);
            if(k==h)
            {
                System.out.println("You Won");
                z=z+1;
            }
            else
            {
                System.out.println("You Lose");
            }
           
        }
       }        
    }

    

