class App extends Persona{
	String nombre;
	int edad;
	Persona persona = new Persona();

	public static void main(String[] args) {
		App app = new App();
		app.nombre = "Diego";
		app.edad = 20;
		System.out.print("Nombre: "+ app.nombre + "\nEdad: "+ app.edad+ '\n');
		app.persona.AsignarComportamiento(new Normal());
		System.out.print("Caminar: ") ;
		app.Caminar();
		System.out.print("Respirar: ") ;
		app.Respirar();
		System.out.print("Brincando: ");
		app.Brincar();


		//Lastimado
		System.out.print("\n\nMe cai y no puedo Caminar \n");
		app.persona.AsignarComportamiento(new Lastimado());
		System.out.print("Caminar: ") ;
		app.Caminar();
		System.out.print("Respirar: ") ;
		app.Respirar();
		System.out.print("Brincando: ");
		app.Brincar();

		//Invalido
		System.out.println("\n\nEstoy invalido");
		app.persona.AsignarComportamiento(new Discapacitado());
		System.out.print("Caminar: ") ;
		app.Caminar();
		System.out.print("Respirar: ") ;
		app.Respirar();
		System.out.print("Brincando: ");
		app.Brincar();
		System.out.print('\n');
	}


}