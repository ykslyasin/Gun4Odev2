package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseGamerManager;
import Entity.Gamer;
import Abstract.GamerCheckService;

public class GamerManager implements BaseGamerManager{
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void signUp(Gamer gamer) throws RemoteException{
		gamerCheckService.checkIfRealPerson(gamer);
		
		if (this.gamerCheckService.checkIfRealPerson(gamer)) {
			
			System.out.println("Kay�t ba�ar�l� : " + gamer.getFirstName());
			
		}else {
			throw new RemoteException("Kay�t ba�ar�s�z : Ge�ersiz kullan�c� bilgisi");
		}
	}

	@Override
	public void updateProfile(Gamer gamer) {
		System.out.println("Kullan�c� profili g�ncellendi : " + gamer.getFirstName());
	}

	@Override
	public void deleteProfile(Gamer gamer) {
		System.out.println("Kullan�c� profili silindi : " + gamer.getFirstName());
	}

}
