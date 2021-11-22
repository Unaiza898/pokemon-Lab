import java.util.*;


public class Squirtle extends  Pokemon {
	

	
	public Squirtle() {
		
		
		super("Squirtle", 100, "water");
	attacks.add(new Moves(30, "water" , "Water Gun"));
	attacks.add(new Moves(40, "water" , "Water Pulse"));
	attacks.add(new Moves(20, "normal" , "tackle"));
	attacks.add(new Moves(20, "normal" , "Fake out"));
	}
	
	// pokemon speak when it comes out of the pokemon balll 
	public  void speak() {
		
		System.out.println("Squirtle!!!!");

	}
	
	
	
	// pokemon attacks
	// pokemon cannot attack if they dont have the require powerpont 
	//for the attack
	
	public void attack(Pokemon other) {


		if((getChoosen() < attacks.size() )&& ( (attacks.get(getChoosen()).getPowerPoint()) < hitPoints)  )
		{
			
			if(other.getPokemonType() == "electric" && attacks.get(getChoosen() ).getType() == "normal"){
				other.hitPoints -= 90;
				System.out.print(attacks.get(getChoosen() ).getName() +" not effective :( " );
				System.out.println(other.getName() + " hp fell down to " + other.hitPoints);
			}

	 
			if(other.getPokemonType() == "electric" && attacks.get(getChoosen() ).getType() == "water"){
				other.hitPoints -= 90;
				System.out.print(attacks.get(getChoosen() ).getName() +" is  Super effective!! " );
				System.out.println(other.getName() + " hp fell down to " + other.hitPoints);
			}

			
	        if(other.hitPoints == 0 || other.hitPoints < 0 )	{
	        	System.out.println();
	        	System.out.println("Game Over Sqirtle  won" );
	        }
	       
	    			
		}
		
		else {
			
			System.out.println("try again and if your hp is lower than 20 run "); 
			
		}
	
	}




public String toString(){
	// builds the string to print the output
	String s = "";
     s += super.toString();
	return s;
}
	
	
}
