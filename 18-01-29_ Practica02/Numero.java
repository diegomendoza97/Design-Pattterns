public class Numero extends Campo{

	static String nombre = "11234";

	public static void main(String[] args) {
		Numero nom  = new Numero();

		nom.setValidation(new Phone());
		nom.validar(nombre);
	}
	
}