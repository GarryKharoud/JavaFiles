
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class LargestArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        int k,l,m;
        k=a[0];
        l=a[0];
        m=a[0];
        for (int i=0;i<=9;i++) {
            System.out.println("Enter The Marks of "+(i+1)+" Student = ");
            a[i]=s.nextInt();
        }
        for (int i=0;i<=9;i++) 
        {
            if(k<a[i])
            {
                m=l;
                l=k;
                k=a[i];
                
            }
            else
            {
                if(l<a[i])
                {
                    
                    m=l;
                    l=a[i];
                }
                else
                {
                    if(m<a[i])
                    {
                        m=a[i];
                    }
                }
            }
        }
        System.out.println("Most Marks Are = "+k);
        System.out.println("Second Most Marks Are = "+l);
        System.out.println("Third Most Marks Are = "+m);
    }
   }
