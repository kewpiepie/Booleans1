package weektwo;

import java.util.Scanner;

public class codinghw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter your name:"); 

	String name = sc.nextLine();
	
	int input = 0;
	
	System.out.println("Hello " + name+ " Want to play a game? ");
	
	
	
	
	String answer = sc.nextLine();
	
	if ( answer.equals("yes")) {
		System.out.println("(1) Door number 1");
		System.out.println("(2) Door Number 2");
		System.out.println("(3) Door number 3");
		System.out.println("(4) Door number 4");
		
		input = sc.nextInt();
		
		
		
		
		String res = "Congratulations you have won ";
		
		switch(input)   { 
			case 1: 
				System.out.println( res + " a couple milky ways");
				break;
				
			case 2: 
				System.out.println( res + " a weekend with Elliott");
				break;
				
			case 3: 
				System.out.println( res + " a new desk chair");
				break;
				
			case 4:
				System.out.println(res + "a new iphone ");
			
			case 5: 
				System.out.println( " Thank you for playing");
				break; 
		}	
	} else { 
		
		System.out.println("Goodbye!");
		
	}
	
	
	
	
	}
	
	
}

