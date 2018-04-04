import java.util.*;
public class Adapter implements Iterator{
	Enumeration enumeration;

	public Adapter(Enumeration enume){
		enumeration = enume;
	}

	public boolean hasNext(){
		return enumeration.hasMoreElements();
	}

	public Object next(){
		return enumeration.nextElement();
	}

	public void remove(){
		System.out.println("Funcion no se puede");
	}

	public void setEnum(Enumeration enume){
		enumeration = enume;
	}
}