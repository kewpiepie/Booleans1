package weektwo;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter your Name:  ");
		String name = sc.nextLine();
		
		System.out.println("Welcome, " + name);
		
		int selection = 0; 
		double total = 0;
		
		while (selection !=4) {
		
		System.out.println(" Select an option.");
		System.out.println(" 1) add a candybar to shopping cart: 1.99");
		System.out.println(" 2) add a cheese to shopping cart: 6.95");
		System.out.println(" 3) add a soccer ball to shopping cart: 12.99");
		System.out.println(" 4) check out");

		
		selection = sc.nextInt();
		
		
		
		switch (selection) { 
		case 1: 
			total += 1.99; 
			break; 
		
		case 2: 
			total += 6.95; 
			break; 
			
		case 3:
			total += 12.99; 
			break; 
		case 4: 
			break;
			
				
		default: 
			System.out.println("Please pick a valid selection."); 
		}
		
		
		
		{ System.out.println("Your current total is: " + total);
		
		
			
		
			
			
		

		}
		
	
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
}
