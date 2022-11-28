
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter First Number = ");
        a=s.nextInt();
        System.out.println("Enter Second Number = ");
        b=s.nextInt();
        c=a+b;
        System.out.println("Sum Of Two Numbers = "+c);
        
    }
    
}
