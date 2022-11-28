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
public class HowManyVowels {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String a;
       System.out.println("Enter The String = ");
       a=s.nextLine();
       int k=a.length();
       int f=0;
       int g=0;
       int t=0;
       int d;
       for(int i=0;i<k;i++)
       {
           char h=a.charAt(i);
           if(h=='a'|| h=='e'|| h=='i'||h=='o'||h=='u'||h=='A'||h=='E'||h=='I'||h=='O'||h=='U')
           {
              f=f+1;
           }
          else
           {
          if(h==' ')
           {
               g=g+1;
           }
           else
           {
                if(h>='a'&&h<='z' || h>'A'&& h<='Z')
                {
                    t=t+1;
                }
           }
         
           }
       }
       
        System.out.println("vowels "+f);
        System.out.println("spaces "+g);
        System.out.println("consonents "+t);
    }
    
}
