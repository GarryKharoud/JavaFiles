/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class DeleteASubstring {
  public static void main(String[] args) {
        String a="Jatin Singla";
        String j[]=a.split(" ");
        for (int i=0; i<j.length-1; i++)
        {
            for(int k=1;k<j.length-1;k++)
            {
        
            if(j[i]==j[k])
            {
                j[i]=j[i+1];
            }
            
        }
            System.out.println(j[i]);
    }
    }
}
