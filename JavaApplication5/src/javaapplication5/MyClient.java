

import java.rmi.Naming;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author hp
 */
public class MyClient {
    public static void main(String[] args) {
        try {
            Adder stub =(Adder)Naming.lookup("rmi://192.168.18.152/sonoo");
            Connection c= DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
            PreparedStatement p=c.prepareStatement("select * from info");
            ResultSet r=p.executeQuery();
            while(r.next())
            {
                int x=r.getInt(1);
                System.out.println(x);
            }
        } catch (Exception e) {
            
        }
    }
}
