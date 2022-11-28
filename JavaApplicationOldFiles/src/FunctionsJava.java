
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class FunctionsJava {
    int add(int a,int b)
    {
        int c,d,e;
        d=a;
        e=b;
        c=d+e;
        return c;
    }
            
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.println("Enter The Value Of a = ");
        a=s.nextInt();
        System.out.println("Enter The Value Of b = ");
        b=s.nextInt();
        System.out.println("The Sum Of Numbers Is = ");
        FunctionsJava d=new FunctionsJava();
        int z=d.add(a, b);
        System.out.println(z);
        
    }
    
}