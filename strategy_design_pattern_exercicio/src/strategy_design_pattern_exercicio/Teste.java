package strategy_design_pattern_exercicio;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Character> characters = new ArrayList <> ();
		Random gerador = new Random ();
		
		for(int i=0; i<4; i++) {
			if(i == 0) {
				characters.add(new King());
				WeaponBehavior w = new SwordBehavior();
				characters.get(i).setWeapon(w);
			}
			else if(i == 1) {
				characters.add(new Queen());
				WeaponBehavior w = new BowAndArrowBehavior();
				characters.get(i).setWeapon(w);
			}
			else if(i == 2) {
				characters.add(new Troll());
				WeaponBehavior w = new AxeBehavior();
				characters.get(i).setWeapon(w);
			}
			else {
				characters.add(new Knight());
				WeaponBehavior w = new KniferBehavior();
				characters.get(i).setWeapon(w);
			}
		}	
			for(int i=0; i!=4;) {
				int c1= gerador.nextInt(3);
				int c2 = gerador.nextInt(3);
				while(c1==c2) {
					 c1= gerador.nextInt(3);
					 c2 = gerador.nextInt(3);
				}
				characters.get(c1).display();
				System.out.print(" ");
				characters.get(c1).fight();
				System.out.print(" at the ");
				characters.get(c2).display();
				System.out.println();
				i = gerador.nextInt(5);
		}
	}

}
