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
public class HowManyAinJatin {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a;
        System.out.println("Enter The String = ");
        a=s.nextLine();
        System.out.println(a);
         int k=0;
         int j=a.length();
        int i;
        for(i=0;i<j;i++)
        {
            if(a.charAt(i)=='a')
            {
                k=k+1;
            }
        }
        System.out.println("The Number Of Times A Is Repeated Is = "+k);
    }
    
}
