package aula13;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private LocalDateTime moment;
	private OrderStatus status;
	
	private Clients client;
	
	private List<OrderItem> items = new ArrayList<>();
	
	
	
	
	public List<OrderItem> getItems() {
		return items;
	}


	public Order(){
		
	}
	
	public Order(LocalDateTime moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	
	
	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public void addItem(OrderItem ordemitem) {
		items.add(ordemitem);
	}
	public void removeItem(OrderItem ordemitem) {
		items.remove(ordemitem);
	}
	public Double total() {
		Double sum = 0.0;
		for (OrderItem x: items) {
			sum +=x.subTotal();
		}
		return sum;
	}
	

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (OrderItem x: items) {
			sb.append(x);
		}
		return sb.toString();
	}
	
	
	
}
