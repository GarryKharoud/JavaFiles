
import java.util.Scanner;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
class Kharoud extends Thread{
    public void run()
    {
        
        try 
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException ex) 
        {
            Logger.getLogger(Kharoud.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Game Over");
        System.exit(0);
    }
}
public class GameOver extends Thread{
    
    public void run()
    {
        try 
            {   
                Thread.sleep(20000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Total Score = "+z);
            System.exit(0);
    }
    static int z=0;
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         GameOver t=new GameOver();
         t.start();
       
        for (boolean i=true;i!=false;) 
        {
            System.out.println("Enter The Number = ");
            Kharoud kk = new Kharoud();
            kk.start();
            int k;
            k=s.nextInt(); 
            kk.stop();
            Random g=new Random();
            int h=g.nextInt(1+9);
            System.out.println(h);
            if(k==h)
            {
                System.out.println("You Won");
                z=z+1;
            }
            else
            {
                System.out.println("You Lose");
            }
        }
       
       }
}
