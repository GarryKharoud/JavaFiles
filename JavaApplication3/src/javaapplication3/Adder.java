
import java.rmi.*;

/**
 *
 * @author Devilsoul
 */
public interface Adder extends Remote{
    public int add(int x,int y)throws RemoteException; 
}
