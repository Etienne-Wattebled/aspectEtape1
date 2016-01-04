
public class Order {
	private int id;
	private double amount;
	private Client client;
	
	public Order(int id, double amount, Client client) {
		this.id = id;
		this.amount = amount;
		this.client = client;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public void printOrder() {
		System.out.print(id);
		System.out.print(" ");
		System.out.print(amount);
		System.out.print(" ");
		System.out.print(client.getName());
	}
}
