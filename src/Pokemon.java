/**
 * 
 */

/**
 * @author nizam
 *
 */

import java.util.*;
public abstract class Pokemon {

	private int choosen ; // the user select the pokemon
	
	//Data!
	    private String name; // pokemon name
	   protected ArrayList<Moves> attacks = new ArrayList<Moves>() ;
		protected int hitPoints;  //make it protected to show inheritance
		private String pokemonType;
		
	
		//OF CERTAIN DATA FIELDS
		public Pokemon(String n, int hp, String pt ) {
			name = n;
			hitPoints = hp;
			pokemonType = pt;
		}
		
		public String getPokemonType() {
			return pokemonType;
		}

		public void setPokemonType(String pokemonType) {
			this.pokemonType = pokemonType;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		

		public Pokemon() {
			name = "";
			hitPoints = 0;
		}
		
		//Methods!!!
		//I am permitted to write AND DEFINE methods in an abstract class.
		
	public abstract void speak();
	//We want our Shapes to...ATTACK!!!

	public abstract void attack(Pokemon other);

	public ArrayList<Moves> getAttacks() {
		return attacks;
	}
//
//	public void setAttacks(ArrayList<Moves> attacks) {
//		this.attacks = attacks;
//	}

	

	public String toString(){
		// builds the string to print the output
		String s = "";
		s += "name" + name + "Type" + pokemonType ;
	   
		return s;
	}

	public int getChoosen() {
		return choosen;
	}

	public void setChoosen(int choosen) {
		this.choosen = choosen;
	}



}



