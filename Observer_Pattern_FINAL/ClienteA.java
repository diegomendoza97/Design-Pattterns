import java.util.*;
public class ClienteA implements Observador{


	String nombre;
	List<Paquete> paquetes = new ArrayList<Paquete>();

	public ClienteA(String n){
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