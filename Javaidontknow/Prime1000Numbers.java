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
public class Prime1000Numbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         int a,c,i,d;
        for(d=1;d<=1000;d++)
        {
            a=d;
            c=0;
            for(i=2;i<=a-1;i++)
            {
                if(a%i==0)
                {
                    c=1;
                }
            }
            if(c==0)
            {
                System.out.println(i);
            }
        }
       
    }
    
}
