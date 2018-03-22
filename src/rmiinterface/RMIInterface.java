package rmiinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {

	public String assuncao(String cidade, int temperaturaMaxima, int temperaturaMinima) throws RemoteException, InterruptedException;
	public String bogota(String cidade, int temperaturaMaxima, int temperaturaMinima) throws RemoteException, InterruptedException;
	public String brasilia(String cidade, int temperaturaMaxima, int temperaturaMinima) throws RemoteException, InterruptedException;
	public String caracas(String cidade, int temperaturaMaxima, int temperaturaMinima) throws RemoteException, InterruptedException;
	public String lima(String cidade, int temperaturaMaxima, int temperaturaMinima) throws RemoteException, InterruptedException;
	public String montevideu(String cidade, int temperaturaMaxima, int temperaturaMinima) throws RemoteException, InterruptedException;
	public String quito(String cidade, int temperaturaMaxima, int temperaturaMinima) throws RemoteException, InterruptedException;
	public String santiago(String cidade, int temperaturaMaxima, int temperaturaMinima) throws RemoteException, InterruptedException;
	
}
