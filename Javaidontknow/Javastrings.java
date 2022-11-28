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
public class Javastrings {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a;
        a=s.nextLine();
        System.out.println("The Striing Is = "+a);
        int i =a.length();
        System.out.println(i);
        char b = a.charAt(3);
        System.out.println(b);
        String f;
        f=s.nextLine();
        String c = a.substring(1);
        System.out.println(c);
        if(a.equals(f))
        {
            System.out.println("HELLO");
        }
        else
        {
            System.out.println("BYE");
        }
    }
    
}