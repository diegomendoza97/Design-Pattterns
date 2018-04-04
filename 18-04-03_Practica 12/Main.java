import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		
		Vector vector = new Vector();
		for(int i = 0; i < 10;i++){
			vector.add(i);
		}

		Adapter adapter = new Adapter(vector);
		// setEnum(vector);
		System.out.println("hasNext: "+ adapter.hasNext());
		System.out.println("Next [0]: "+adapter.next());
		System.out.print("Remove ");
		adapter.remove();
		
	}
}