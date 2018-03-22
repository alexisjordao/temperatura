package rmiserver;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import rmiinterface.RMIInterface;

import java.util.Random;

public class ServerSantiago extends UnicastRemoteObject implements RMIInterface {

	private static final long serialVersionUID = 1L;
	
	protected ServerSantiago() throws RemoteException {
		
		super();
		
	}
	
	public String santiago(String cidade, int temperaturaMaxima, int temperaturaMinima) throws RemoteException, InterruptedException{
		
		System.err.println("Você está recebendo alertas para " + cidade + "!");
		while (true) {
			Random random = new Random();
			int nAleatorio = random.nextInt(44);
			Thread.sleep(1000);
			if (nAleatorio > temperaturaMaxima) {
				return "Temperatura: " + nAleatorio + "°C. Acima do esperado!"; 
			}
			else if (nAleatorio < temperaturaMinima) {
				return "Temperatura: " + nAleatorio + "°C. Abaixo do esperado!";
			}
			
		}	
	}
	
	@Override
	public String assuncao(String cidade, int temperaturaMaxima, int temperaturaMinima) throws RemoteException, InterruptedException {
	
		return null;	
		
	}
	
	@Override
	public String bogota(String cidade, int temperaturaMaxima, int temperaturaMinima) throws RemoteException, InterruptedException {
	
		return null;	
		
	}
	
	@Override
	public String brasilia(String cidade, int temperaturaMaxima, int temperaturaMinima) throws RemoteException, InterruptedException {
	
		return null;	
		
	}
	
	@Override
	public String caracas(String cidade, int temperaturaMaxima, int temperaturaMinima) throws RemoteException, InterruptedException {
	
		return null;	
		
	}
	
	@Override
	public String lima(String cidade, int temperaturaMaxima, int temperaturaMinima) throws RemoteException, InterruptedException {

		return null;	
		
	}
	
	@Override
	public String montevideu(String cidade, int temperaturaMaxima, int temperaturaMinima) throws RemoteException, InterruptedException {
		
		return null;	
		
	}
	
	@Override
	public String quito(String cidade, int temperaturaMaxima, int temperaturaMinima) throws RemoteException, InterruptedException {
		
		return null;	
		
	}
	
	public static void main(String[] args){

        try {

            Naming.rebind("//localhost/ServerSantiago", new ServerSantiago());
            System.err.println("Server ready");

        } catch (Exception e) {

            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();

        }

    }
	
}

