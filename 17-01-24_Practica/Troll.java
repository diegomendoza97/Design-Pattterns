public class Troll extends Character{


	static AxeBehavior axe  = new AxeBehavior();


	public void fight(){
		System.out.println("I am a Troll");
		weapon.useWeapon();

	}	
	public static void main(String[] args) {
		Troll troll = new Troll();

		troll.setWeapon(axe);

		troll.fight();
	}
}