
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class DeleteArray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a[]=new int[10];
        for (int i = 0; i <=9; i++) 
        {
            System.out.println("Enter Marks Of Student "+(i+1)+" = ");
            a[i]=s.nextInt();
        }
        System.out.println("Enter The Marks You Want To Delete = ");
        int b=s.nextInt();
        for (int i = 0; i <=9; i++) 
        {
            if(a[i]==b)
            {
                for (int j = 0; j <=9; j++) 
                {    
                    a[i]=a[i+1];
                    System.out.println("Marks After Deleting "+(i+1)+" = "+a[i]); 
                }
            }                          
        }
    }
}
