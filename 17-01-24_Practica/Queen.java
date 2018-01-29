public class Queen extends Character{

	static KnifeBehavior knife  = new KnifeBehavior();

	public void fight(){
		System.out.println("I am the Queen");
		weapon.useWeapon();

	}	
	public static void main(String[] args) {
		Queen queen = new Queen();

		queen.setWeapon(knife);

		queen.fight();
	}
}