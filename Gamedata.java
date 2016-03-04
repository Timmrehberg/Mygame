import java.util.Scanner;
public class Gamedata {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String Name;
		String Choice1;
		String Choice2;
		String Choice3;
		String Choice4;
		
		System.out.println("Enter Your Name");
		Name = scan.nextLine();
		System.out.println("Welcome: " + Name);
		System.out.println("You hear a loud bang inside"); 
		System.out.println("Enter or Run");
		Choice1 = scan.next();
		if (Choice1 .equals ("Run")) {
			System.out.print("A nearby volcano erupts and you die"); 
			System.exit(0);
			 }
		else {
			System.out.print("You enter the cave and see a dragon"); }
		
			System.out.print(" Attack or Run from the dragon");
			Choice2 = scan.next();
			if (Choice2 .equals ("Attack"))
			System.out.print("You Kill that dragon with your wicked skillz");
	else { System.out.print("Youre not outrunning a dragon: Try again?"); 
	System.exit(0); }
	
	System.out.print(" After slaying the mighty dragon you notice a weeping window in the corder: Walk or Throw Rock");
	Choice3 = scan.next();
	if  (Choice3 .equals ("Walk")) {
	System.out.print("The widow thanks you for your services and you start leaving the cave"); }
	else { 
		System.out.println("You hit her in the head and kill her"); 
		System.exit(0);}
	
	System.out.println("Exiting the cave you see a hungry lion approaching: Fight the lion, Run, Throw the widow on the lion");
	Choice4 = scan.next();
	switch (Choice4) {
	case "Fight":
		System.out.println("You seriously tried to fight a lion? :Try again?");
		break;
	case "Run":
		System.out.println("You make it 5 feet before becoming lunch");
		break;
	case "Throw":
		System.out.println("Eh you didnt even really know her anyway: You win!");
	break;
	default:
		System.out.println ("The lion eats you"); }
	
	System.out.print("Thanks for playing");
	
	}
	
	
	}
	
	

	
	



				
				
			
			
			
			
			
			
			
	
	

	
	
		
			
		
		
			
		
		
		
			
		
		
		
		
		
		
		

	


