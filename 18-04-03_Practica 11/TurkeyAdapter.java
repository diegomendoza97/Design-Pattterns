public class TurkeyAdapter implements Dogable{
	Turkey turkey = new Turkey() ;

	public void bark(){

		turkey.talk();
	}

	public void bite(){
		turkey.attack();
	}
}