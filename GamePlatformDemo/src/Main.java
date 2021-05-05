

import java.rmi.RemoteException;
import java.time.LocalDate;

import Entity.Gamer;
import Entity.Game;
import Entity.Order;
import Entity.Campaign;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Abstract.GamerCheckService;
import Concrete.GameManager;
import Concrete.OrderManager;
import Concrete.CampaignManager;

public class Main {

	public static void main(String[] args) throws RemoteException {
		Gamer yasin = new Gamer();
		yasin.setId(1);
		yasin.setFirstName("Yasin");
		yasin.setLastName("Yüksel");
		yasin.setBirthDate(LocalDate.of(1999 , 10 , 3));
		yasin.setNationalId(27089548148L);
		
		GamerCheckService gamerCheckService = new GamerCheckManager();
		
		GamerManager gamerManager = new GamerManager(gamerCheckService);
		gamerManager.signUp(yasin);
		
		Game callOfDuty = new Game();
		callOfDuty.setId(1);
		callOfDuty.setName("Call Of Duty");
		callOfDuty.setPrice(450);
		callOfDuty.setCompany("Activision");
		
		Game battlefield5 = new Game();
		battlefield5.setId(2);
		battlefield5.setName("Battlefield 5");
		battlefield5.setPrice(500);
		
		
		GameManager gameManager = new GameManager();
		gameManager.add(callOfDuty);
		gameManager.add(battlefield5);
		gameManager.delete(battlefield5);
		
		Order order1 = new Order();
		order1.setId(1);
		order1.setGameId(callOfDuty.getId());
		order1.setGamerId(yasin.getId());
		order1.setDateOfOrder(LocalDate.of(2021 , 5 , 5));
		order1.setNumberOf(1);
		order1.setOrderPrice(callOfDuty.getPrice());
		
		
		OrderManager orderManager = new OrderManager();
		orderManager.order(order1, yasin);
		
		
		
		Game watchDogs = new Game();
		watchDogs.setId(3);
		watchDogs.setName("Watch Dogs");
		watchDogs.setPrice(300);
		watchDogs.setCompany("Ubisoft");
		
		Game splinterCell = new Game();
		splinterCell.setId(4);
		splinterCell.setName("Splinter Cell");
		splinterCell.setPrice(250);
		splinterCell.setCompany("Ubisoft");
		
		gameManager.add(splinterCell);
		gameManager.add(watchDogs);
		
		
		Campaign ubisoftCampaign = new Campaign();
		ubisoftCampaign.setId(1);
		ubisoftCampaign.setName("\"Ubisoft 20 Years Anniversary\"");
		ubisoftCampaign.setDiscount(50);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(ubisoftCampaign);
		
		Order order2 = new Order();
		order2.setId(2);
		order2.setGameId(splinterCell.getId());
		order2.setGamerId(1);
		order2.setDateOfOrder(LocalDate.of(2021 , 5 , 6));
		order2.setNumberOf(1);
		order2.setOrderPrice(splinterCell.getPrice() * ubisoftCampaign.getDiscount() / 100);
		
		orderManager.order(order2, yasin);
		
	}

}
