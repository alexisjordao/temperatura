package rmiclient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import rmiinterface.RMIInterface;

public class ClientOperation {

	private static RMIInterface look_up;
	
	public static void main(String[] args)
		throws MalformedURLException, RemoteException, NotBoundException, InterruptedException {
		
		String cidade = JOptionPane.showInputDialog("Para iniciar, escolha seu local: ");
		int temperaturaMaxima = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura máxima esperada: "));
		int temperaturaMinima = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura mínima esperada: "));
		cidade = cidade.toLowerCase();
		System.out.println(cidade);
		
		String output = "";
		if (cidade.equals("assuncao")) {
			look_up = (RMIInterface) Naming.lookup("//localhost/ServerAssuncao");
			output = look_up.assuncao(cidade, temperaturaMaxima, temperaturaMinima);
		}
		else if (cidade.equals("bogota")) {
			look_up = (RMIInterface) Naming.lookup("//localhost/ServerBogota");
			output = look_up.bogota(cidade, temperaturaMaxima, temperaturaMinima);
		}
		else if (cidade.equals("brasilia")) {
			look_up = (RMIInterface) Naming.lookup("//localhost/ServerBrasilia");
			output = look_up.brasilia(cidade, temperaturaMaxima, temperaturaMinima);
		}
		else if (cidade.equals("caracas")) {
			look_up = (RMIInterface) Naming.lookup("//localhost/ServerCaracas");
			output = look_up.caracas(cidade, temperaturaMaxima, temperaturaMinima);
		}
		else if (cidade.equals("lima")) {
			look_up = (RMIInterface) Naming.lookup("//localhost/ServerLima");
			output = look_up.lima(cidade, temperaturaMaxima, temperaturaMinima);
		}
		else if (cidade.equals("montevideu")) {
			look_up = (RMIInterface) Naming.lookup("//localhost/ServerMontevideu");
			output = look_up.montevideu(cidade, temperaturaMaxima, temperaturaMinima);
		}
		else if (cidade.equals("quito")) {
			look_up = (RMIInterface) Naming.lookup("//localhost/ServerQuito");
			output = look_up.quito(cidade, temperaturaMaxima, temperaturaMinima);
		}
		else if (cidade.equals("santiago")) {
			look_up = (RMIInterface) Naming.lookup("//localhost/ServerSantiago");
			output = look_up.santiago(cidade, temperaturaMaxima, temperaturaMinima);
		}
		else{
			System.out.println("Nenhum dado encontrado!");
		}
		JOptionPane.showMessageDialog(null, output);
		
	}
}
