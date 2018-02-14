import java.util.*;
public class Paquete{
	Random rand = new Random();
	Observador cliente;
	int id;

	public Paquete(Observador cliente){
		this.id = rand.nextInt(1000);
		// cliente.paquetes.add(this);
		this.cliente = cliente;
	}

	public void info(){
		System.out.println("Package Id: "+ id);
		System.out.println("Client: "+ cliente.getName());
	}

}