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
public class StringSplitting {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a="This Is My First Function";
        String b[]=a.split(" ");
        for(int i=0;i<=b.length-1;i++)
        {
            System.out.println(b[i]);
        }
        
    }
}
