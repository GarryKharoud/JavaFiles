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
public class NewClass 
{
    public static void main(String[] args) 
    {
        int i,j;
        int k=0;
        for(i=2;i<=5;i++)
        {
            for(j=i;j<=4;j++)
            {
                
                System.out.print(i);
                
                i++;
                j++;
            }
            System.out.println();
        }
    }
}