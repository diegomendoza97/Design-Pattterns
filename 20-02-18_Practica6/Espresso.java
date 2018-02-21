public class Espresso extends Ingredientes{
	Bebida b;
	int costo = 5;

	public Espresso(Bebida bebida){
		b = bebida;
	}

	public void Description(){

			b.Description();
			System.out.println(" -agrego un shot de espresso");
	}

	public int Cost(){
		return b.Cost() + costo;
	}
}