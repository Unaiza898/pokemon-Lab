

public class PokemonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int response ; // user respponse 
		
	   String name;
		HumanPlayer Player1 = new HumanPlayer();
		//takes the human player name
		System.out.println("What is your name?");
		name = input.in.next();
		Player1.setName(name);

		Pokemon PlayerPokemon = Player1.getPokemon();
		System.out.println(Player1.getName()+" choose " +  PlayerPokemon.getName());
		PlayerPokemon.speak();
		
		ComputerPlayer Player2 = new ComputerPlayer();
		Pokemon CumputerPokemon = Player2.getPokemon();
      // if the computer chooses the same pokemon it switches to a different one
		if(CumputerPokemon.getName() == PlayerPokemon.getName()  && PlayerPokemon.getName() == "Pickachu" ) {
			 CumputerPokemon= new Squirtle();
		}
		else if (CumputerPokemon.getName() == PlayerPokemon.getName()  && PlayerPokemon.getName() == "Squirtle"){
			CumputerPokemon= new Pikachu();
		}
		System.out.println("Computer choose " +CumputerPokemon.getName());
		CumputerPokemon.speak();
		

		boolean game = true;
		
		String player= "human";
       /// the game will run until it is false
		while(game == true )
		{
			if(player == "human" ) {
				System.out.println("It is "+ Player1.getName() + " turn");
				 // if hitpoints are leass than 20 pokemon can chose to use an item
				if(PlayerPokemon.hitPoints <= 20)
				{
					System.out.println("Do you want to use an item: 1- yes 2- no");
					response = input.in.nextInt();
					if(response == 1) {
						Player1.getItem();
						// if item is not avalaible the player would automaticallly 
						// run away and give up since the player dont have any item
						// to increase their hp
						if(PlayerPokemon.hitPoints < 20   )
						{
							Player1.run();
							game = false;
						}
						else
						System.out.println("This is my new "+PlayerPokemon.hitPoints);
					}
					
				}
				 // if the opponent pokemon is not zero then it chooses to attack
				else if(CumputerPokemon.hitPoints > 0)
				{
					// displays all the attack
					
					 System.out.println("Choose the attacks from below :");
							for(int i = 0 ; i < PlayerPokemon.attacks.size() ; i ++) {
								System.out.println(  (i+1)   +  " "  + PlayerPokemon.attacks.get(i));
								
							}
				
					int num = input.in.nextInt();
					
					if((PlayerPokemon.attacks.get(num -1 ).getPowerPoint() ) < PlayerPokemon.hitPoints )
					{
						// after the attack it gives it to the computer
						CumputerPokemon.setChoosen(num -1);
						PlayerPokemon.attack(CumputerPokemon);

						
						player = "computer";
						
					}
							
					
				// if compute hitpoints are less than zero or zero 
					// game ends
				}
				if(CumputerPokemon.hitPoints <= 0)
				{
				   game = false;	
				}
	
			
			
			}
			else if(player == "computer" ) {
				
				
				if(CumputerPokemon.hitPoints < 20  )
				{
						Player2.getItem();
						
							if(CumputerPokemon.hitPoints < 20   )
							{
								Player1.run();
								game = false;
								break;
							}
							else
							System.out.println("This is my new "+CumputerPokemon.hitPoints);
						
					
					
					
				}
				// IF THE PLAYER HIT POINT ARE GREATER THAN ZERO COMPUTER ATTACKS
				else if(PlayerPokemon.hitPoints > 0 ) {
					System.out.println("It is opponent(computer)" + " turn");
					System.out.println("It is " + CumputerPokemon.getName() + " turn");
					int num = (int) (Math.random()*4);
		
					if((CumputerPokemon.attacks.get(num ).getPowerPoint() ) < CumputerPokemon.hitPoints )
					{
					
						CumputerPokemon.setChoosen(num);
						CumputerPokemon.attack(PlayerPokemon);

						
							player= "human";
						
					}
					
			
			
				}
				
				//if hitpoint is zero or less than zero it ends the game
				
				if(PlayerPokemon.hitPoints <= 0)
				{
				   game = false;	
				}
			
			
			}
	
			
			
			
		}
		
		
	}

}
