package pojopack;

import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Balance extends Remote{

	public Students fundStudent ( String studentId , BigDecimal amount);
	public void moveAmount ( int fromstudentid , int tostudentid , BigDecimal amount ) throws RemoteException;
}
