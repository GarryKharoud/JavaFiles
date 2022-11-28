
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class GreatestThreeNumbers {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int a;
        System.out.println("Enter The Value Of a = ");
        a=s.nextInt();
        int b;
        System.out.println("Enter The Value Of b = ");
        b=s.nextInt();
        int c;
        System.out.println("Enter The Value Of c = ");
        c=s.nextInt();
        if (a>b)
        {
            if(a>c)
            {
                System.out.println("a Is Greater");
            }
            else
            {
                System.out.println("c Is Greater");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("b Is Greater");
            }
            else
            {
                System.out.println("c Is Greater");
            }
        }
        
       
    }
    
}
