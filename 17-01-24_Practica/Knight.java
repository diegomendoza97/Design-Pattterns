public class Knight extends Character{
	

	static SwordBehavior sword  = new SwordBehavior();

	public void fight(){
		System.out.println("I am a knight");
		weapon.useWeapon();

	}	
	public static void main(String[] args) {
		Knight knight = new Knight();

		knight.setWeapon(sword);

		knight.fight();
	}
}