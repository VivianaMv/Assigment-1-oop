package Nov16;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Wellcome to Pargol's Store");
		System.out.println("Please give me the inventory ");
		int maxComputer = kb.nextInt();
		Computer[] inventory = new Computer[maxComputer];
		int choice;
		
		do {
			System.out.println("What do you want to do? ");
			System.out.println("1: Enter new computers (password required");
			System.out.println("2: Change information of a computer (password required ");
			System.out.println("3: Display all computers by a specific brand ");
			System.out.println("4: Display all computers under a certain a price. ");
			System.out.println("5: Quit ");
			System.out.println("Please enter your choice > ");
			
			choice = kb.nextInt();
			
		}while(choice != 5);
	
	
		
		Scanner kb1 = new Scanner(System.in);
		System.out.println("Please give your password");
		String pwd = kb1.nextLine();
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
		            pwd = kb1.nextLine();

		        
		
		        }
		   
		    }
		}
	}
}


