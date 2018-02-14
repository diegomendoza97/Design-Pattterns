import java.util.*;
public class Dhl implements Observable {
	
	List<Observador> clientes = new ArrayList<Observador>();
	String proveedor = "DHL";

	public void AgregarCliente(Observador c){
			clientes.add(c);

	}
	public void Notify(){
		for (Observador c : clientes ) {
			System.out.println(proveedor);
			c.update();
		}
	}


}