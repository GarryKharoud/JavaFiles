/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class ForLoopTest {
    public static void main(String[] args) {
        int i,j;
       int k=1;
       for(i=1;i<=5;i++)
       {
           for (j=1;j<=i; j++) 
           {
               j=j+1;
               System.out.print(k);
               k++;
           }
           
           System.out.println();
       }
    }
    
}