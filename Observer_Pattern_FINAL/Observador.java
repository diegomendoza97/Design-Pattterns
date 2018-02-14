import java.util.*;
public interface Observador{
	//public List<Paquete> paquetes = new ArrayList<Paquete>();
	// public String nombre {get;set;}

	public void subscribe(Observable o);
	public void update();

	//public void setName(String n);
	public String getName();
}