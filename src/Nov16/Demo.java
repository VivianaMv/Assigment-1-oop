package Nov16;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me the inventory ");
		int maxComputer = kb.nextInt();
		Computer[] inventory = new Computer[maxComputer];
		int choise;
		
		do {
			System.out.println("menu ");
			System.out.println("1 : hsdlksjd");
			System.out.println("2: sdsf ");
			System.out.println("3: sdsf ");
			System.out.println("4: sdsf ");
			
			choise = kb.nextInt();
			
		}while(choise != 5);
		

	}

}
