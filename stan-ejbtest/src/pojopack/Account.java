package pojopack;

import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Account extends Remote{
	
	public void createStudent ( String studentname , String stuaddress , BigDecimal amount)throws RemoteException;
	public void createVehicle ()throws RemoteException;
	public void readPolyQuery() throws RemoteException;
}
