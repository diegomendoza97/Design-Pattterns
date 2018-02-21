public class Cafe extends Bebida{

	// public String size = "";
	int sizeAddition = 0;


	public Cafe (String s){
		size = s;
		System.out.println("----->"+size);
		
	}

	public void Description(){
		System.out.println("Soy un Cafe " + size);
	}

	public int Cost(){
		setSizeAddition();
		return 20 + sizeAddition;
	}

	public void setSizeAddition(){
		if(size == "S" ){
			sizeAddition = 5;
		}
		else if( size == "M"){
			sizeAddition = 10;
		}
		else {
			sizeAddition = 20;
		}
	}

}