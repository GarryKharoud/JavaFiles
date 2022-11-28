
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Devilsoul
 */
public class AdderRemote extends UnicastRemoteObject implements Adder{
    AdderRemote()throws RemoteException{
        super();
    }
    public int add(int x,int y){
        try {
            Connection c =DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
            PreparedStatement p =c.prepareStatement("insert into numbers values(?,?)");
            p.setInt(1, x);
            p.setInt(2, y);
            p.execute();
        } catch (Exception e) {
        }
        return x+y;}
}
