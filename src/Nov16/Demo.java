package Nov16;

import java.util.Scanner;

public class Demo extends Computer {
	// Function to find computers with a price lower than the one entered by the
	// user.
	// the function need the variable for the price and the array where the
	// computers are stored
	public static void findCheaperThan(double priceValue, Computer[] inventory) {
		boolean found = false;
		// This is a for that iterates in each index of the array and shows the
		// characteristics of the
		// computers that are stored on the inventary
		for (Computer computer : inventory) {
			// if the price entered by the user is lower than the price of the computers
			// display all the computers with lower price
			if (computer.getPrice() < priceValue) {
				System.out.println("-----------------------------------");
				System.out.println(computer);
				System.out.println("-----------------------------------");
				System.out.println();
				found = true;
			}
		}
		if (!found) {
			System.out.println("No computers found with a price lower than: " + priceValue);
		}
	}

	public static void findComputersBy(String brandName, Computer[] inventory) {
		boolean found = false;
		for (Computer computer : inventory) {
			if (computer.getBrand().equalsIgnoreCase(brandName)) {
				// if the brand entered by the user is the same as one of the stored ones
				// display computers with that brannd
				System.out.println("-----------------------------------");
				System.out.println(computer);
				System.out.println("-----------------------------------");
				System.out.println();
				found = true;
			}
		}
		if (!found) {
			System.out.println("No computers found with the brand: " + brandName);
		}
	}

	// Function to validate passwords
	private static boolean validatePassword(Scanner scanner) {
		final int total_attempts = 3;
		int tries = 0;
		String password = "password";
		// the user enters the password, only if he/she doesn't exceeds the total
		// attempts
		while (tries < total_attempts) {
			System.out.println("Please enter your password:");
			String inputPwd = scanner.nextLine();
			// if password is correct return true
			if (inputPwd.equals(password)) {
				System.out.println("Your password is correct.");
				return true;
			} else {
				// if password is not correct let the user try again
				System.out.println("Incorrect password. Please try again.");
				tries++;
			}
		}
		// if user exceeds number of tries close the program
		System.out.println("Exceeded maximum attempts. Access denied.");
		return false;
	}

	public static void main(String[] args) {
		// variables
		Scanner kb = new Scanner(System.in);
		Scanner kb2 = new Scanner(System.in);
		int maxComputer;
		int index_computer;
		int index_display;
		System.out.println("Wellcome to Pargol's Store");
		System.out.println("Please give me the inventory: ");
		maxComputer = kb.nextInt();
		Computer[] inventory = new Computer[maxComputer];
		int availableSpace = inventory.length;
		int choice1;
		int choice;

		// MAIN MENU
		do {
			System.out.println("What do you want to do? ");
			System.out.println("1: Enter new computers (password required)");
			System.out.println("2: Change information of a computer (password required)");
			System.out.println("3: Display all computers by a specific brand ");
			System.out.println("4: Display all computers under a certain a price. ");
			System.out.println("5: Quit ");
			System.out.println("Please enter your choice > ");
			choice = kb.nextInt();

			switch (choice) {
				case 1:
					if (validatePassword(kb2)) {
						System.out.println("How many computers do you want to add?");
						int newComputers = kb.nextInt();
						// user only can add computers if it is enough space on the inventary
						if (newComputers <= availableSpace) {
							for (int i = 0; i < newComputers; i++) {
								System.out.println(" ");
								if (inventory[i] == null) {
									Computer c = new Computer();
									System.out.printf("Computer %d - Enter the brand: ", i + 1);
									c.setBrand(kb.next());
									System.out.printf("Computer %d - Enter the model: ", i + 1);
									c.setModel(kb.next());
									System.out.printf("Computer %d - Enter the price: ", i + 1);
									c.setPrice(kb.nextDouble());
									inventory[i] = c;
									System.out.println();
								}
							}
							// reduce the space of the
							availableSpace -= newComputers;
						} else {
							System.out.println("You cannot add that amount of computers.");
						}
					}
					break;

				case 2:
					if (validatePassword(kb2)) {
						System.out.println("which computer number do you wish to update?");
						// user enters the computer that needs an updated
						index_display = kb.nextInt();
						// since indexes in java starts in 0 rest 1
						index_computer = index_display - 1;
						// loop where the index needs to equal or bigger than zero
						// and also it has to not exceed the lenght of the array
						if (index_computer < inventory.length && index_computer >= 0) {
							System.out.println("-----------------------------------");
							System.out.println("This is the PC you want to update:");
							System.out.printf("Computer #%d is:", index_display);
							System.out.println();
							System.out.println("-----------------------------------");
							inventory[index_computer].toString();
							System.out.println("-----------------------------------");
							System.out.println();
							// menu to update the computer
							do {
								System.out.println("What information would you like to change? ");
								System.out.println("1: brand ");
								System.out.println("2: model ");
								System.out.println("3: SN ");
								System.out.println("4: price ");
								System.out.println("5: Quit ");
								System.out.println("Please enter your choice > ");
								choice1 = kb.nextInt();
								switch (choice1) {
									case 1:
										// get brand and change it with set brand
										System.out.println("Enter the new brand:");
										String newBrand = kb.next();
										inventory[index_computer].setBrand(newBrand);
										break;
									case 2:
										// get model and change it with set model
										System.out.println("Enter the new model:");
										String newModel = kb.next();
										inventory[index_computer].setModel(newModel);
										break;
									case 3:
										// get sn and change it with set sn
										System.out.println("Enter the new serial number:");
										long newSerialNumber = kb.nextLong();
										inventory[index_computer].setSn(newSerialNumber);
										break;
									case 4:
										// get price and change it with set price
										System.out.println("Enter the new price:");
										double newPrice = kb.nextDouble();
										inventory[index_computer].setPrice(newPrice);
										break;
									case 5:
										// quit
										System.out.println("Returning to the main menu.");
										break;
									default:
										// in case the user types a different option of the existing ones
										System.out.println("Invalid choice. Please choose again.");
										break;
								}
								// display computer with updated
								System.out.println("-----------------------------------");
								System.out.println("Updated Computer Details:");
								System.out.println(inventory[index_computer]);
								System.out.println("-----------------------------------");
							} while (choice1 != 5);
						} else {
							System.out.println(
									"You wish to enter another computer, please try option 1 in the main menu");
						}
					}
					break;

				case 3:
					// user search for computers of the same brand
					System.out.println("Enter the brand name to search for:");
					String searchBrand = kb.next();
					findComputersBy(searchBrand, inventory);
					break;
				case 4:
					// user search for computers with lower price entered
					System.out.println("Enter the price value do you want to search:");
					double searchPrice = kb.nextDouble();
					findCheaperThan(searchPrice, inventory);
					break;
				case 5:
					// closing the software
					System.out.println("Thank you for using this software.");
					break;
				default:
					// in case the user types an unexisting option
					System.out.println("-----------------------------------");
					System.out.println("Invalid Option!!!, try again");
					System.out.println("-----------------------------------");
					System.out.println();
					break;
			}
		} while (choice != 5);
		// close the program
		kb.close();
	}

}
