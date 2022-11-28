
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
        int b;
        for (int i = 0; i <=9; i++) {
            System.out.print("Enter Marks "+(i+1)+" = ");
            a[i]=s.nextInt();
        }
        for (int i = 0; i <=9; i++) {
            for (int j = 0; j <=8; j++) {
                if(a[j]>a[j+1])
                {
                    b=a[j+1];
                    a[j+1]=a[j];
                    a[j]=b;
                }
            }
        }
        System.out.println("Ascending Order = ");
        for (int i = 0; i <=9; i++) {
            System.out.println(a[i]+"  ");
        }
    }
}
