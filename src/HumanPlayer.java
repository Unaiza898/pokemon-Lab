
import java.util.Scanner;
public class HumanPlayer extends Player {

	 private Pokemon PokemonChosen;
	 private String name;
	 
	public Pokemon getPokemon() {
	
		
		int number;
		System.out.println("You have 2 pokemon choice 1- Pikachu 2- Squirtle)");
    number = input.in.nextInt();
		
		if(number == 1)
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
	

	
	public Item getItem() {
		System.out.println("Choose from the item below:  1: Revive 2: potion");
		int response = input.in.nextInt();
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


//	public String toString() {
//		String s = "";
//		s += "Name: " + name;
//		return s;
//	}
	
	

}
