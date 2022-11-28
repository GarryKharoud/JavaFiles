

import java.rmi.Naming;

/**
 *
 * @author hp
 */
public class MYServer {
    public static void main(String[] args) {
        try {
            Adder stub=new AdderRemote();
            Naming.rebind("rmi://192.168.18.152/sonoo", stub);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
