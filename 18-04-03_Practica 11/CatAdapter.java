public class CatAdapter implements Dogable{
	Cat cat = new Cat();

	public void bark(){

		cat.purr();
	}

	public void bite(){
		cat.slash();
	}
}