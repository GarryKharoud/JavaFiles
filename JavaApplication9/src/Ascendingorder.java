
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Ascendingorder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        int c,d,i,j;
        System.out.println("helloo");
        for (i=0;i<=9; i++) 
        {
            System.out.print("Enter The Marks Of The Student "+(i+1)+"=");
            a[i]=s.nextInt();
        }
        for(j=0;j<=9;j++)
        {
            for(c=0;c<=8;c++)
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
        for ( i=0;i<=9;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
}
