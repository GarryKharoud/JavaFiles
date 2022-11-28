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
public class SwitchRestaurant {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b,c,d,i,j=0,bill=0;
	for(i=1;i==1;)
	{
	  System.out.println("welcome ");
	  System.out.println("press 1 for breakfast");
	  System.out.println("press 2 for lunch ");
	  System.out.println("press 3 for dinner ");
	a=s.nextInt();
	switch(a)
	{
		case 1:
		  System.out.println("item name         price ");
		  System.out.println("sandwich          50 ");
		  System.out.println("tea               30 ");
		  System.out.println("coffee            20 ");
		b=s.nextByte();
		switch(b)
		{
			case 1: 
			  System.out.println("hope you like the sandwich ");
			bill=bill+50;
			break;
			case 2:
			  System.out.println("hope you like the tea ");
			bill=bill+30;
			break;
			case 3:
			  System.out.println("hope you like the coffee ");
			bill=bill+20;
			break;
		}
		break;
		case 2:
			  System.out.println("item name            price ");
			  System.out.println("pork                 100 ");
			  System.out.println("chicken              50 ");
			  System.out.println("pig                  80 ");
                          c=s.nextInt();
			switch(c)
			{
				case 1: 
			      System.out.println("hope you like the pork ");
			    bill=bill+100;
			    break;
			    case 2:
			      System.out.println("hope you like the chicken ");
			    bill=bill+50;
			    break;
			    case 3:
			      System.out.println("hope you like the pig ");
			    bill=bill+80;
			    break;
			}
			break;
			case 3:
				  System.out.println("item name           price");
				  System.out.println("pizza               120 ");
				  System.out.println("cake                180 ");
				  System.out.println("pastries             20 ");
				d=s.nextInt();
				switch(d)
				{
					case 1:
						  System.out.println("hope you like your pizza ");
						bill=bill+120;
						break;
					case 2:
						  System.out.println("hope you like your cake ");
						bill=bill+180;
						break;
					case 3:
						  System.out.println("hope you like your pastries ");
                                                  
						bill=bill+20;
						break;
				}
	        }
	    
          System.out.println();
		  System.out.println("do you want to comtinue (1/0) : ");
		  System.out.println("press 1 to continue");
        i=s.nextInt();
       
	}
		  System.out.println();
		  System.out.println("bill :");
		  System.out.println(bill);
	
}
        
    }
    

