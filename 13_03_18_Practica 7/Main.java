public class Main{
	

	public static void main(String[] args) {

		PizzaStore store = new PizzaPlayas();
		Pizza p = store.orderPizza("Haiwana");

		System.out.println("\n");

		store = new PizzaCetys();
		Pizza po = store.orderPizza("asdsa");

		System.out.println("\nOrdenando Otra vez\n");

		po = store.orderPizza("Peperoni");

	}
}