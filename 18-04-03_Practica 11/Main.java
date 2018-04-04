public class Main{

	public static void main(String[] args) {
		Beagle beagle = new Beagle();
		Doberman doberman = new Doberman();
		Dogable cat = new CatAdapter();
		Dogable turkey = new TurkeyAdapter();

		beagle.bark();
		cat.bark();
		doberman.bark();
		turkey.bark();
		System.out.println();
		beagle.bite();
		cat.bite();
		doberman.bite();
		turkey.bite();

	}

}