/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author hp
 */
public class MovingFirstLetterToLast {
    public static void main(String[] args) {
        System.out.println("Welcome Kharoud Garry");
        String a="This IS My First Program";
        String b[]=a.split(" ");
        for (int i = 0; i<b.length; i++) 
        {
            char c=b[i].charAt(0);
            String d=b[i].substring(1);
            System.out.println(d+c);
        }
    }
}
