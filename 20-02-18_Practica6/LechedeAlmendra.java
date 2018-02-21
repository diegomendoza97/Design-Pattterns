public class LechedeAlmendra extends Ingredientes{
	Bebida b;
	int costo = 5;

	public LechedeAlmendra(Bebida bebida){
		b = bebida;
	}

	public void Description(){

			b.Description();
			System.out.println(" -agrego Leche de Almendra");
	}

	public int Cost(){
		return b.Cost() + costo;
	}
}