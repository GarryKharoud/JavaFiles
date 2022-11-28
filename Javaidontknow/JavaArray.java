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
public class JavaArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        int i;
        for(i=0;i<=9;i++)
        {
            System.out.println("Enter The Marks Of Student "+(i+1)+" = ");
            a[i]=s.nextInt();
        }
        for(i=0;i<=9;i++)
        {
            if(a[0]<a[i])
            {
                a[0]=a[i];
            }
        }
        System.out.println("Largest Number = "+a[0]);
    }
    
}
