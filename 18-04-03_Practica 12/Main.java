import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		
		Vector vector = new Vector();
		for(int i = 0; i < 10;i++){
			vector.add(i);
		}

		Enumeration enume = vector.elements();
		Adapter adapter = new Adapter(enume);
		
		System.out.println("hasNext: "+ adapter.hasNext());
		System.out.println("Next [0]: "+adapter.next());
		System.out.print("Remove ");
		adapter.remove();
		
	}
}