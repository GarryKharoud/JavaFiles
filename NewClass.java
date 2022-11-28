
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
           int a[]=new int[10];
        int d;
        System.out.println("helloo");
        for (int i=0;i<=9; i++) 
        {
            System.out.print("Enter The Marks Of The Student "+(i+1)+"=");
            a[i]=s.nextInt();
        }
        for(int i=0;i<=9;i++)
        {
            for(int c=0;c<=8;c++)
            {
                if(a[c]>a[c+1]);
                {
                    d=a[c+1];
                    a[c+1]=a[c];
                    a[c]=d;
                }
            }
        }
        System.out.println("Ascending Order Of Numbers = ");
        for ( int i=0;i<=9;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
    
}
