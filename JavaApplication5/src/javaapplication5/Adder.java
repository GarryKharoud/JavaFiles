

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author hp
 */
public interface Adder extends Remote{
 public  int add(int x,int y)throws RemoteException;
 

}
