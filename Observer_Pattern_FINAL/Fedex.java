import java.util.*;
public class Fedex implements Observable{


	List<Observador> clientes = new ArrayList();
	String proveedor = "Fedex";


	public void AgregarCliente(Observador c){
			clientes.add(c);

	}
	public void Notify(){
		for (Observador c: clientes ) {
			System.out.println(proveedor);
			c.update();
		}
	}


}