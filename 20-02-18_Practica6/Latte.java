public class Latte extends Bebida{

	int sizeAddition = 0;
	String size ="";


	public Latte (String s){
		size = s;
	}

	public void Description(){
		System.out.println("Soy un Latte "+ size);

	}

	public int Cost(){
		setSizeAddition();
		return 40 +sizeAddition;
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