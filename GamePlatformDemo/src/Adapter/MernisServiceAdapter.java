package Adapter;

import java.rmi.RemoteException;
import Entity.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter {
	
	public boolean checkIfRealPerson(Gamer gamer) throws RemoteException {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		return proxy.TCKimlikNoDogrula(gamer.getNationalId() , 
				                       gamer.getFirstName() , 
				                       gamer.getLastName() , 
				                       gamer.getBirthDate().getYear());
	}
}