package strategy_design_pattern_exercicio;

public class Character {
	WeaponBehavior weapon;
	public void fight () {
		weapon.useWeapon();
	}
	public void setWeapon (WeaponBehavior w) {
		this.weapon = w;
	}
	public void display() {
		System.out.print(this.getClass().getSimpleName());
	}
	
}

