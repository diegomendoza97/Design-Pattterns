import java.util.*;
public class CorreoMex implements Observable{
	
	List<Observador> clientes = new ArrayList();
	String proveedor = "Correos de Mexico";

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