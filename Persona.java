
public class Persona {
			String nombre ;
			int edad;
			Genero genero;
			//Normal personanormal = new Normal() ;
			//Dsica
			public static Comportamientos  comportamiento;


		// public static void main(String[] args) {
		// 	Persona persona = new Persona();
		// 	persona.Caminar();

		// }
	

	public static  void Caminar(){
		comportamiento.Caminar();
	}

	public static void Brincar(){
		comportamiento.Brincar();
	}


	public static void Respirar(){	
		comportamiento.Respirar();
	}

	public void AsignarComportamiento(Comportamientos asignComp){
		this.comportamiento = asignComp;
	}





}

