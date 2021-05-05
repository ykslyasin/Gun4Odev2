package Concrete;

import Entity.Game;
import Abstract.GameService;

public class GameManager implements GameService{
	public void add(Game game) {
		System.out.println("Oyun kay�t edildi : " + game.getName());
	}
	
	public void delete(Game game) {
		System.out.println("Oyun silindi : " + game.getName());
	}
}
