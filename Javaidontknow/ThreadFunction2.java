/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author hp
 */
  class ThreadFunction3 extends Thread{
        public void run()
        {
         for (int i = 100; i <=150; i++) {
            System.out.println(+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
          }
         }
         }
 }
class ThreadFunction2 extends Thread{
    public void run()
    {
     for (int i = 51; i <100; i++) {
            System.out.println(+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
   
    
    public static void main(String[] args) {
  ThreadFunction2 b=new ThreadFunction2();
  b.start();
  ThreadFunction3 c=new ThreadFunction3();
         c.start();
        for (int i = 1; i <=50; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
       
    }
}
    

