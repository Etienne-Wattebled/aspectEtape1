
public class Launcher {
	public static void main(String args[]) {
		Clients clients = new Clients();
		Orders orders = new Orders();
		
		Client c1 = new Client("Julie","Rue Jules Barni");
		clients.addClient(c1);
		
		Client c2 = new Client("Arnaud","Rue Blin de Bourdon");
		clients.addClient(c2);
		
		Client c3 = new Client("Lucie","Rue de Beauvais");
		clients.addClient(c3);
		
		System.out.println(clients.delClient(c1));
		
		Order o1 = new Order(0,125.50,c2);
		c2.addOrder(o1);
		orders.addOrder(o1);
		
		System.out.println(clients.delClient(c2));
		
	}
}
