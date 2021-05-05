package Abstract;

import java.rmi.RemoteException;

import Entity.Gamer;

public interface BaseGamerManager {
	public void signUp(Gamer gamer) throws RemoteException;
	public void updateProfile(Gamer gamer);
	public void deleteProfile(Gamer gamer);
}
