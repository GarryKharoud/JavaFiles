/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class NewClass {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        String a="1";
        for (int i = 0; i < n-1; i++) 
        {
            String b="";
            int c=0;
            for (int j = 0; j < a.length(); j++) 
            {
                c=0;
                int k;
                for ( k = j; k<a.length(); k++) {
                    if(a.charAt(j)==a.charAt(k))
                    c++;
                    else
                    break;
                   
                }
               
                b=b+c+a.charAt(j);
                 j=k-1;
            }
            a=b;
        }
        System.out.println(a);
    }
    
}
