/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Devilsoul
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        a =s.nextInt();
        System.out.print("Enter 2nd number: ");
        b =s.nextInt();
        c=a+b;
        System.out.println("sum: "+c);
    }
    
}
