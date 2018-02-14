import java.util.*;
public class ClienteB implements Observador{

	String nombre;
	List<Paquete> paquetes = new ArrayList<Paquete>();

	public ClienteB(String n){
		nombre = n;
	}

	public void subscribe(Observable o){
			if( o instanceof Dhl){
				o.AgregarCliente(this);
			}
			else if ( o instanceof Fedex){
				o.AgregarCliente(this);
			}
			else if (o instanceof CorreoMex){
				o.AgregarCliente(this);
			}
			else{

			}
	}

	public void update(){
		for (Paquete p : paquetes ) {
			p.info();
		}

	}

	public void ordernarPaquete(){
		Paquete pack = new Paquete(this);
		paquetes.add(pack);
	}

	public String getName(){
		return nombre;
	}
}