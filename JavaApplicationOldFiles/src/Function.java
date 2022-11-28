
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Function {
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
        System.out.println("Enter a = ");
        a=s.nextInt();
        System.out.println("Enter b = ");
        b=s.nextInt();
        Function d=new Function();
        int z=d.add(a,b);
        System.out.println(z);
        
    }
    

}