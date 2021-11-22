
public class Potion implements Item {
	
	private int noOfItem = 1; // this is a one time only item 
	
	/*
	 * Increase the pokemon by 20 points
	 * pokemon can recover its self once
	 */
	public Potion(Pokemon other) {
		if(noOfItem > 0)
		{
		 
			other.hitPoints += 20;
			noOfItem--;
		}
		else {
			System.out.println("Sorry ran out of potions");
		}
	
	
	}
	
	// user use a pokemon
	public void use(Pokemon p) {
		
		System.out.println("I chooose " + p.getName() );
		
	}

}