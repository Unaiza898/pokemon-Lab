
public class Revive implements Item {
	
	private int noOfItem = 1;
	public Revive(Pokemon other) {
		if(noOfItem > 0)
		{
		
			other.hitPoints += 50;
			noOfItem--;
		}
		else {
			System.out.println("sorry u ran out of items");
		}
		
	
	}
	
	
	public void use(Pokemon p) {
		
		System.out.println("I chooose " + p.getName() );
		
	}

}
