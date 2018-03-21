public class Cliente{
	
	public static void main(String[] args) {
		int indexundo;
		// //Commander
		Invoker i = new Invoker();
		// //Commandos Concretos
		ComandoLuces luz = new ComandoLuces();
		ComandoGarage garage = new ComandoGarage();
		ComandoLavadora lavadora = new ComandoLavadora();
		ComandoAC ac = new ComandoAC();

		i.setCommand(luz);
		i.setCommand(luz);
		i.setCommand(garage);
		i.setCommand(garage);
		i.setCommand(lavadora);
		i.setCommand(lavadora);
		i.setCommand(ac);
		i.setCommand(ac);

		i.buttonExecute(7);
		i.buttonExecute(4);
		Deshacer(i);
		i.buttonExecute(2);
		i.buttonExecute(1);
		i.buttonExecute(6);

		Deshacer(i);

		
	}

	public static void Deshacer(Invoker i){
		System.out.print("UNDO --->");
		int index = i.pointers.get(i.pointers.size()-1);
		i.buttonExecute(index);

	}

}