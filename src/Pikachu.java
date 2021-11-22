import java.util.*;



public class Pikachu extends  Pokemon {
	

	   
 
/*
 * 	 adds the attacks int the pokemon moves
		
 */
	public Pikachu() {
	
		super("Pickachu", 100, "electric");
	attacks.add(new Moves(50, "electric" , "thunderbolt"));
	attacks.add(new Moves(20, "normal" , "Quick Attack"));
	attacks.add(new Moves(30, "steel" , "Irontail"));
	attacks.add(new Moves(20, "normal" , "tackle"));
	}
	// speaks prints out what the pokemon speaks
	public  void speak() {
		System.out.println("Pika pika pika chuuuuu!!!!");
	}
	
/*
 *  attacks the pokemon of the opponent	
 */
	public void attack(Pokemon other) {
				
		if( getChoosen() < attacks.size()&& attacks.get(getChoosen()).getPowerPoint() < hitPoints )
		{
			if(other.getPokemonType() == "water" && attacks.get(getChoosen()).getType() == "electric"){
				other.hitPoints -= 50;
				System.out.print("Super effective!!" + other.getName() + " hp fell down to " + other.hitPoints);
			}
			else if(other.getPokemonType() == "water" && (attacks.get(getChoosen()).getType() == "normal" || attacks.get(getChoosen()).getType() == "steel")){
				other.hitPoints -= 20;
				System.out.print("not effective :(" + other.getName() + " hp fell down to " + other.hitPoints);
			}
	
	        if(other.hitPoints == 0 || other.hitPoints < 0 )	{
	        	System.out.println();
	        	System.out.println("Game Over Pichachu won" );
	        }	        
		}
	  
		else {
			
			System.out.println("hahahaha attack not found or ur hp is too low pls try again "); 
			
		}

	}
	
	




public String toString(){
	// builds the string to print the output
	String s = "";
     s += super.toString() + hitPoints;
	return s;
}

}




	


