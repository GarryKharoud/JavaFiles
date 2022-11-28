
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
class garry
{
    static int c,d,e,f;
    public void swap(int x,int y)
    {
        
        c=x;
        d=y;
        e=c;
        f=d;
        c=f;
        d=e;
       
    }
    
}
public class FunctionSwap 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The First Number = ");
        int a=s.nextInt();
        System.out.println("Enter The Second Number = ");
        int b=s.nextInt();
        garry l=new garry();
        l.swap(a, b);
        System.out.println("Number 1 After Swap = "+a);
        System.out.println("Number 2 After Swap = "+b);

    }
}