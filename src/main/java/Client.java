import java.util.LinkedList;


public class Client {
	private String name;
	private String address;
	
	public Client(String name, String address) {
		this.orders = new LinkedList<Order>();
		this.name = name;
		this.address = address;
	}
	
	private LinkedList<Order> orders;
	
	public void addOrder(Order order) {
		orders.add(order);
	}
	
	public boolean hasOrder() {
		return !this.orders.isEmpty();
	}
	
	public void delOrder(Order o) {
		this.orders.remove(o);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public LinkedList<Order> getOrders() {
		return orders;
	}
	
	public void setOrders(LinkedList<Order> orders) {
		this.orders = orders;
	}
}
