

import java.rmi.Naming;

/**
 *
 * @author Devilsoul
 */
public class MyServer {
    public static void main(String[] args) {
        try {
            Adder stub=new AdderRemote();
            Naming.rebind("rmi://192.168.18.167/sonoo", stub);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
