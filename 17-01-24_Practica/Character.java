public abstract class Character{
	static WeaponBehavior weapon;

	public static void setWeapon(WeaponBehavior w){
		 weapon = w;
	}

	public abstract void fight();
}