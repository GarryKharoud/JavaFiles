
import java.util.Scanner;

/*y
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class SelectionSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        int c,d;
        for(int i=0;i<=9;i++)
        {
            System.out.print("Enter Marks of Student "+(i+1)+" = ");
            a[i]=s.nextInt();
        }
        for(int i=0;i<=9;i++)
        {
                c=i;
                for (int j = i+1; j <=9; j++) {
                if (a[j]<a[c]) 
                {
                    c=j;
                }
                d=a[c];
                a[c]=a[i];
                a[i]=d;
            }
        }
        System.out.println("Ascending Order Of Marks = ");
        for (int i = 0; i<= 9; i++) 
        {
            System.out.print(a[i]+"  ");
        }
    }
}
