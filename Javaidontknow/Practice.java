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
public class Practice {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Value Of String = ");
        String a;
        a=s.nextLine();
        System.out.println("The Value Of String Is = "+a);
        int i=a.length();
        System.out.println(i);
        char b=a.charAt(8);
        System.out.println(b);
        String d=a.substring(4,7);
        System.out.println(d);
        System.out.println("The Value Of Second String Is = ");
        String h;
        h=s.nextLine();
        if(a.equals(h))
        {
            System.out.println("HELLO");
        }
        else
        {
            System.out.println("BYE");
        }
    }   
}