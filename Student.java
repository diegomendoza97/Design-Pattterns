public class Student extends Persona{

	int matricula;
	String carrera;
	static Normal normal  = new Normal();
	static Persona persona = new Persona();
	//persona.comportamiento = normal;
	public static void main(String[] args) {
		
		persona.AsignarComportamiento(normal);
		Student estu = new Student();
		estu.matricula = 22657;
		estu.carrera = "ICC";

		estu.Caminar();
		System.out.print("Matricula " + estu.matricula+'\n'+ "Carrera "+ estu.carrera);


	}



}