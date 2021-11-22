
public class ComputerPlayer extends Player {
	private Pokemon PokemonChosen;
	// computer choses in random
	public Pokemon getPokemon() {
		

		
		int response =(int) (Math.random()*2 )+1; 
		
		if( response== 1)
		{
			PokemonChosen = new Pikachu();
		}
		else
		{
			PokemonChosen =  new Squirtle();
		}

		return PokemonChosen;
				
	}
	
	
	public  void run() {
		
		System.out.println("Unfortunatrly you lost and choose to run away");
		
	}
	

	// computer can select the item
	public Item getItem() {
		
		System.out.println("Choose from the item below:  1: Revive 2: potion");
		int response =(int) (Math.random()*2)+1;
		Item item ;
		if(response == 1)
		{  
			return item = new Revive(PokemonChosen);
		}
		else 
		{
	
			 return item = new Potion(PokemonChosen);
		}
	    
	}

}
