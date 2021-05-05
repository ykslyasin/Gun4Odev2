package Entity;

import java.time.LocalDate;

public class Order {
	private int id;
	private int gamerId;
	private int gameId;
	private LocalDate dateOfOrder;
	private double orderPrice;
	private int numberOf;
	

	public Order() {
		
	}

	public Order(int id, int gamerId, int gameId, LocalDate dateOfOrder, double orderPrice, int numberOf) {
		super();
		this.id = id;
		this.gamerId = gamerId;
		this.gameId = gameId;
		this.dateOfOrder = dateOfOrder;
		this.orderPrice = orderPrice;
		this.numberOf = numberOf;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public LocalDate getDateOfOrder() {
		return dateOfOrder;
	}

	public void setDateOfOrder(LocalDate dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public int getNumberOf() {
		return numberOf;
	}

	public void setNumberOf(int numberOf) {
		this.numberOf = numberOf;
	}
	
	
}
