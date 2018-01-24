class Cojo extends Persona{
	// String nombre;
	// string eda
	static Lastimado lastimado = new Lastimado();
	static Persona persona = new Persona();

	public static void main(String[] args) {
		persona.AsignarComportamiento(lastimado);

		Cojo cojo = new Cojo();
		cojo.Caminar();
		
		}
}