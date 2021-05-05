package Abstract;

import Entity.Order; 
import Entity.Gamer;

public interface OrderService {
	public void order(Order order , Gamer gamer);
}
