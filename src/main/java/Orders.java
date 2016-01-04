import java.util.LinkedList;


public class Orders {
	
	private LinkedList<Order> orders;
	
	public Orders() {
		this.orders = new LinkedList<Order>();
	}
	
	public void addOrder(Order o) {
		this.orders.add(o);
	}
	
	public void delOrder(Order o) {
		this.orders.remove(o);
	}
}
