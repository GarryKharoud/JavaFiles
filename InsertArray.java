
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class InsertArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        for (int i=0;i<=9;i++)
        {
            System.out.print("The Marks Of Student "+(i+1)+" is = ");
            a[i]=s.nextInt();
        }
        System.out.println("The Marks You Want To Delete = ");
        int b=s.nextInt();
        for (int i=0;i<=9;i++)
        {
            if(b<=0)
            {
                for (int j = 0; j <=9; j++) 
                {
                    
                }
            }
        }
    }
}
