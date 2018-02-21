public class Crema extends Ingredientes{
	public Bebida b;
	int costo = 5;

	public Crema(Bebida bebida){
		b = bebida;
	}

	public void Description(){

			b.Description();
			System.out.println(" -agrego Crema");
	}

	public int Cost(){

		if(b instanceof Cafe|| b instanceof Latte){
			// System.out.println("Leggue");
			if(b.size == "S"){
				costo = 5;
			}
			else{
				costo = 10;
			}
		}

			return b.Cost() + costo;
	}

}