
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
class kharoud
{
    int add(int a,int b)
    {
        int c,d,e;
        c=a;
        d=b;
        e=c+d;
        return e;
    }
    void prime(int x)
    {
        int l=0;
        for (int i = 2; i <=x; i++) 
        {
            if(x%i==0)
            {
                l=1;
            }
        }
        if(l==0)
        {
            System.out.println("The Number Is Not Prime");
        }
        else
        {
            System.out.println("The Number Is Prime");
        }
}
}
public class FunctionsRevis 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.print("Enter Value of a = ");
        a=s.nextInt();
        System.out.print("Enter Value of b = ");
        b=s.nextInt();
        kharoud k=new kharoud();
        int z=k.add(a, b);
        System.out.print("The Sum is = "+(z));
        System.out.println();
        k.prime(z);
    }
}
