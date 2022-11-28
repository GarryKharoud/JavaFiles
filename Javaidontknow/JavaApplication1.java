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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {System.out.println("hello ");
    Scanner s=new Scanner(System.in);
    int a;
        System.out.println("Enter The Value Of a = ");
        a=s.nextInt();
        int b;
        System.out.println("Enter The Value Of b = ");
        b=s.nextInt();
        System.out.println("Value Of a = "+a);
        System.out.println("Value Of b = "+b);
        System.out.println("Hello Again");
        int c;
        c=a+b;
        System.out.println("Sum Of a And b = "+c);
        
        // TODO code application logic here
    }
    
}
