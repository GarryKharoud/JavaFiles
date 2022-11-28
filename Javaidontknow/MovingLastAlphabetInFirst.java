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
public class MovingLastAlphabetInFirst {
    public static void main(String[] args) {
        String a="This Is My First String";
        String b[]=a.split(" ");
        for (int i = 0; i <b.length; i++) 
        {
            char c=b[i].charAt(b[i].length()-1);
            String d=b[i].substring(0,b[i].length()-1);
            System.out.println(c+d);
            
        }
        
    }
    
}
