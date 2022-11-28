
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        try { 
        c=a/b;
        System.out.println(c);
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
        System.out.println("HELLO");
    }
}
