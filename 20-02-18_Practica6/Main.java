public class Main {

	public static void main(String[] args) {
	
		Bebida cafe = new Cafe("L");
		cafe = new Crema(cafe);
		cafe = new Espresso(cafe);
		System.out.println("El costo del cafe es: "+ cafe.Cost());
		cafe.Description();
		cafe = new LechedeAlmendra(cafe);
		System.out.println("El costo del cafe es: "+ cafe.Cost()+"\n");
		cafe.Description();

		Bebida latte = new Latte("S");
		latte.Description();
		System.out.println("El costo del Latte: "+ latte.Cost()+"\n");

		latte = new Latte("L");
		latte.Description();
		System.out.println("El costo del Latte: "+ latte.Cost()+"\n");
		
		latte = new Latte("L");
		latte = new Crema(latte);
		latte.Description();
		System.out.println("El costo del Latte: "+ latte.Cost());

	}

}