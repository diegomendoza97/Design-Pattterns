public class Main{
	public static void main(String[] args) {
	
	String nombre = "Diego123";
	String numero = "6643897678";
	String correo = "diego@hotmail.com";
	String estado = "123asdl";
	String passw = "contrasena1234";
	
	Campo field = new Nombre();

	//Nombre
	field.setValidation(new Name());
	System.out.print("Validacion Nombre: ");
	field.validar(nombre);

	//Numero 
	field = new Numero();
	field.setValidation(new Phone());
	System.out.print("Validacion Telefono: ");
	field.validar(numero);

	//Correo 
	field = new Correo();
	field.setValidation(new Email());
	System.out.print("Validacion Correo: " );
	field.validar(correo);

	//Estado
	field = new Estado();
	field.setValidation(new State());
	System.out.print("Validacion Estado:  ");
	field.validar(estado);

	//Contrasena
	field = new Contra();
	field.setValidation(new Password());
	System.out.print("Validacion Contraseña: ");
	field.validar(passw);
	// field.

	}
}