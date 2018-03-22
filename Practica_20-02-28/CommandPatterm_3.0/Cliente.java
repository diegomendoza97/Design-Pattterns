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
		ComandoCeiling fan = new ComandoCeiling();

		i.setCommand(luz);
		i.setCommand(luz);
		i.setCommand(garage);
		i.setCommand(garage);
		i.setCommand(lavadora);
		i.setCommand(lavadora);
		i.setCommand(fan);

		i.buttonExecute(6);
		i.buttonExecute(6);
		i.buttonUndo(6);
		i.buttonExecute(4);
		i.buttonExecute(2);
		i.buttonExecute(1);

		Deshacer(i);
		Deshacer(i);


		System.out.println("\nCREANDO MACRO....");
		ComandoMacro macro = new ComandoMacro();
		macro.AddComando(garage);
		macro.AddComando(luz);
		macro.AddComando(lavadora);
		macro.AddComando(fan);
		macro.execute();
		macro.undo();

		
	}

	public static void Deshacer(Invoker i){
		int index = i.pointers.get(i.pointers.size()-1);
		i.buttonUndo(index);

	}

}