package Nov16;

import java.util.Scanner;


public class Demo extends Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Wellcome to Pargol's Store");
		System.out.println("Please give me the inventory ");
		int maxComputer = kb.nextInt();
		Computer[] inventory = new Computer[maxComputer];
		int availableSpace = inventory.length;
		int choice;
		int choice1;
		//Computer  addcomputer = new Computer
		
		do {
			System.out.println("What do you want to do? ");
			System.out.println("1: Enter new computers (password required");
			System.out.println("2: Change information of a computer (password required ");
			System.out.println("3: Display all computers by a specific brand ");
			System.out.println("4: Display all computers under a certain a price. ");
			System.out.println("5: Quit ");
			System.out.println("Please enter your choice > ");
			
			choice = kb.nextInt();
			
			
			if (choice == 1) { // here is the loop when the user has to type the password
				
				Scanner kb1 = new Scanner(System.in);
				System.out.println("Please give your password");
				String pwd = kb1.nextLine();
				int tries = 1;
				String password = "password";

				while (tries <= 3) {
				    if (pwd.equals(password)) {
				        System.out.println("Your password is correct");
				        System.out.println("how many computers do yu want to add?");	
				        Scanner kb2 = new Scanner(System.in);
				        int newcomputers = kb2.nextInt();
				        
				        if(newcomputers <= availableSpace) {
				        	for (int i = 0; i< newcomputers; i++) {
				        		
				        	}
				        	availableSpace -= newcomputers;
				        }else {
				        	System.out.println("You can not add many computers");
				        	break;}
				    } else {
				        System.out.println("Your password is incorrect");
				        tries++;
				        if (tries <= 3) {
				            System.out.println("Please try again");
				            pwd = kb1.nextLine();
				        	}
				        }
				
				}
				
			}
			
			
		
			else if (choice == 2) { // the user has to type again the password - e.	When option 2 is entered : 
				
				Scanner kb2 = new Scanner(System.in);
				System.out.println("Please give your password");
				String pwd = kb2.nextLine();
				int tries = 1;
				String password = "password";

				while (tries <= 3) {
				    if (pwd.equals(password)) {
				        System.out.println("Your password is correct");
				        break;
				        
				    } else {
				        System.out.println("Your password is incorrect");
				        tries++;
				        if (tries <= 3) {
				            System.out.println("Please try again");
				            pwd = kb2.nextLine();
				        	}
				        }
				}
			}
				else if (choice == 3) { // Then ask the user which attribute they wish to change by displaying the following menu : 
	
					do {
						System.out.println("What information would you like to change ");
						System.out.println("1: brand ");
						System.out.println("2: model ");
						System.out.println("3: SN ");
						System.out.println("4: price ");
						System.out.println("5: Quit ");
						System.out.println("Please enter your choice > ");
						
						choice1 = kb.nextInt();
						
						if (choice == 5) {
							System.out.println(" Returning to the main menu ");
							break;
						}
					        	}	while(choice1 !=5); 
									
							}
		
			
				else if (choice == 5) {
					System.out.println("Thanks you for using this sofware ");
					break;

		
		}
	
	}while(choice != 5);
		
}
	
}


