
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class AscendingOrder {
 
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        int i,j,k,l,m;
        for(i=0;i<=9;i++)
        {
            System.out.println("Enter The Number "+(i+1)+" = ");
            a[i]=s.nextInt();
        }
        for(j=0;j<=9;j++)
        {
            for(k=0;k<=8;k++)
            {
                if(a[k]>a[k+1])
                {
                    l=a[k+1];
                    a[k+1]=a[k];
                    a[k]=l;
                }
                    
            }
        }
        System.out.print("The Ascending Order Is As Follows = ");
        
            for(m=0;m<=9;m++)
            {
                System.out.print(a[m]+" ");
            }
    
}
}