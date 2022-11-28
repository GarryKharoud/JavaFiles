
import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author Devilsoul
 */
public class MyClient {
    public static void main(String args[]){  
try{  
Adder stub=(Adder)Naming.lookup("rmi://192.168.18.167/sonoo");
Scanner s =new Scanner(System.in);
System.out.print("Enter 1st number: ");
int a =s.nextInt();
System.out.print("Enter 2nd number: ");
int b =s.nextInt();  
System.out.println(stub.add(a,b));  
}catch(Exception e){}  
}  
}
