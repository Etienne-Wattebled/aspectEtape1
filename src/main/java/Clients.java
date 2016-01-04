import java.util.LinkedList;


public class Clients {
	private LinkedList<Client> clients;
	
	public Clients() {
		this.clients = new LinkedList<Client>();
	}
	
	public void addClient(Client c) {
		this.clients.add(c);
	}
	
	public boolean delClient(Client c) {
		if (c.hasOrder()) {
			return false;
		} else {
			return this.clients.remove(c);
		}
	}
}
