import static org.junit.Assert.*;

public class Test {
	
	@org.junit.Test
	public void test() {
		Clients clients = new Clients();
		Orders orders = new Orders();
		
		Client c1 = new Client("Julie","Rue Jules Barni");
		assertFalse(c1.hasOrder());
		
		clients.addClient(c1);
		assertTrue(clients.delClient(c1));
		
		Client c2 = new Client("Arnaud","Rue Blin de Bourdon");
		clients.addClient(c2);
		Order o1 = new Order(0,125.50,c2);
		c2.addOrder(o1);
		assertTrue(c2.hasOrder());
		
		orders.addOrder(o1);
		assertFalse(clients.delClient(c2));
	}
	
}
