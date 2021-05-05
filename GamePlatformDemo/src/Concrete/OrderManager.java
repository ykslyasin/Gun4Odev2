package Concrete;

import Entity.Order;
import Abstract.OrderService;
import Entity.Gamer;

public class OrderManager implements OrderService{
	@Override
	public void order(Order order , Gamer gamer) {
		System.out.println(order.getId() + " numaralý sipariþiniz tamamlandý.Sipariþ tutarý : " + order.getOrderPrice());
		gamer.setOwnedGames(gamer.getOwnedGames() + order.getNumberOf());
	}
}
