
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Arrays {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i;
        int a[]=new int[10];
        for(i=0;i<=9;i++)
        {
            System.out.println("Enter The Marks Of Student "+(i+1)+" = ");
            a[i]=s.nextInt();
        
        
        }
        for(i=0;i<=9;i++)
        {
            if(a[0]<a[i])
            {
                a[0]=a[i];
            }
        }
        System.out.println("The Largest Number = "+a[0]);
        
    }
}