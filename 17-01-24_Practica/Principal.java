public class Principal{
	

	static WeaponBehavior weaponused = new SwordBehavior();

	public static void main(String[] args) {
		//Caballero
		Character fighter = new Knight();
		fighter.setWeapon(weaponused);
		fighter.fight();
		System.out.print('\n');

		//Queen 
		fighter = new Queen();
		fighter.setWeapon(new KnifeBehavior());
		fighter.fight();
		System.out.print('\n');

		//King
		fighter = new King();
		fighter.setWeapon(new BowAndArrow());
		fighter.fight();
		System.out.print('\n');

		//Troll
		fighter = new Troll();
		fighter.setWeapon(new AxeBehavior());
		fighter.fight();

	}

}