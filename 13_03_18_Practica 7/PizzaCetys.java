public class PizzaCetys extends PizzaStore{

	public Pizza createPizza(String pizza){
			Pizza p = null;
			switch(pizza){
			case "Peperoni":
				p = new PeperoniCetys();
				System.out.println("Peperoni estilo Cetys en Camino");
				break;

			case "Haiwana":
				p = new HaiwanaCetys();
				System.out.println("Haiwana estilo Cetys en Camino");
				break;

			default: 
				System.out.println("No existe Pizza");
				//p = null;
				return p;

		}
		p.Hornear();
		p.Cortar();
		p.Empacar();

		return p;
	}

}