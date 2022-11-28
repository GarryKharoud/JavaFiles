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
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         int a,i,c=0;
        System.out.println("Enter The Value Of a = ");
        a=s.nextInt();
        for(i=2;i<=a-1;i++)
        {
            if(a%i==0)
            {
                c=1;
            }
        }
        if(c==0)
        {
            System.out.println("The Given Number Is Prime");
        }
        else
        {
            System.out.println("The Given Number Is Non Prime");
        }
       
    }
}
