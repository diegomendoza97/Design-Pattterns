public class PizzaPlayas  extends PizzaStore{
	

	public Pizza createPizza(String pizza){
		
		Pizza p = null;
		switch(pizza){
			case "Peperoni":
				p = new PeperoniPlayas();
				System.out.println("Peperoni estilo Playas en Camino");
				break;

			case "Haiwana":
				p = new HaiwanaPlayas();
				System.out.println("Haiwana estilo Playas en Camino");
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