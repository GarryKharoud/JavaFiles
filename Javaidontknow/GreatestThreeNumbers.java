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
public class GreatestThreeNumbers {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int a;
        System.out.println("Enter The Value Of a = ");
        a=s.nextInt();
        int b;
        System.out.println("Enter The Value Of b = ");
        b=s.nextInt();
        int c;
        System.out.println("Enter The Value Of c = ");
        c=s.nextInt();
        if (a>b)
        {
            if(a>c)
            {
                System.out.println("a Is Greater");
            }
            else
            {
                System.out.println("c Is Greater");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("b Is Greater");
            }
            else
            {
                System.out.println("c Is Greater");
            }
        }
        
       
    }
    
}
