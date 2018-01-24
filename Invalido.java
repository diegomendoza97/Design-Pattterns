class Invalido extends Persona {
	static Discapacitado invalido = new Discapacitado();
	static Persona persona = new Persona();
	public static void main(String[] args) {
		persona.AsignarComportamiento(invalido);
		Invalido vegetal= new Invalido();
		vegetal.Caminar();
		vegetal.Brincar();
	}
}