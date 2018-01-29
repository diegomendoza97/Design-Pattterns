public class King extends Character{

	static BowAndArrow bow  = new BowAndArrow();

	public void fight(){
		System.out.println("I am the King ");
		weapon.useWeapon();

	}	
	public static void main(String[] args) {
		King king = new King();

		king.setWeapon(bow);

		king.fight();
	}

	
}
