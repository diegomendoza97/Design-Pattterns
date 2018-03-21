public class Cliente{
	
	public static void main(String[] args) {

		//Commander
		Invoker i = new Invoker();

		//Commandos Concretos
		ComandoLuces luz = new ComandoLuces();
		ComandoGarage garage = new ComandoGarage();

		//Usando Comandos
		i.setCommand(luz);

		i.buttonExecute();
		i.buttonUndo();

		System.out.println();

		i.setCommand(garage);
		i.buttonExecute();
		i.buttonUndo();
	}

}