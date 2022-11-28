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
public class PattensJava {
    public static void main(String[] args) {
       
    
     Scanner s=new Scanner(System.in);
                int i,j,t=0,k=8,q=0;
                for(j=1;j<=5;j++)
                {
                    System.out.print("*");
                    for(i=1;i<=t;i++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for(i=1;i<=k;i++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for(i=1;i<=q;i++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    k=k-2;
                    t=t+1;
                    q=q+1;
                    System.out.println("");
                }
       
    
}
}
