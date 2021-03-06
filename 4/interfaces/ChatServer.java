package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatServer extends Remote {
	public ChatProxy subscribeUser(ClientProxy handle) throws RemoteException;
	public boolean unsubscribeUser(ClientProxy handle) throws RemoteException;
	public void broadcastMessage(String username, String message) throws RemoteException;
}
