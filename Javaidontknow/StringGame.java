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
public class StringGame {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Character = ");
        String a=s.nextLine();
        Random r=new Random();
        int i=r.nextInt(a.length());
        System.out.println("Guess The Character = ");
        String h=s.nextLine();
        String d=a.substring(i,i+1);
        if(h.equals(d))
        {
            System.out.println("You Won");
        }
        else
        {
            System.out.println("You Lose");
        }
         System.out.println(a.substring(0,i)+a.substring(i+1));
    }
}
