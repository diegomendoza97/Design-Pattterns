public abstract class PizzaStore{

	public Pizza orderPizza(String tipo){
		return createPizza(tipo);
	}

	public abstract Pizza createPizza(String pizza);
}