package weektwo;
import java.util.Scanner;





public class thursdayclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//user, options, each option should do something 
		// create instance of scanner class for reading inputs from user 
		
		

		Scanner reader = new Scanner(System.in);
		// create variable to hold inputs 
		
		
		
		
		System.out.println("Please enter your name:"); 
		
		//create variable to hold user name
		
		String name = reader.nextLine(); 
		
		//get use input for selection 
		
		int input = 0; 
		
		// prompts user for selection 
		
		
		System.out.println("Hello" + name+ "Select option below:");
		System.out.println("(1) Door number 1");
		System.out.println("(2) Door Number 2");
		System.out.println("(3) Door number 3");
		System.out.println("(4) Exit Application");
		
		// get user selection 
		
		
		input = reader.nextInt();
		
		// check or validate user input print response 
		
		String res = "Congratz you have won";
		
		switch(input)   { 
			case 1: 
				System.out.println( res + " user mini Van");
				break;
				
			case 2: 
				System.out.println( res + " A Chevy Astro");
				break;
				
			case 3: 
				System.out.println( res + " a broom");
				break;
			
			case 4: 
				System.out.println( res + " Thank you for playing");
				break; 
				
				
			
		}
		
		while(input!= 4) { 
			
			System.out.println("Hello" + name+ "Select option below:");
			System.out.println("(1) Door number 1");
			System.out.println("(2) Door Number 2");
			System.out.println("(3) Door number 3");
			System.out.println("(4) Exit Application");
			
			
			// get user selection 
			
			
			input = reader.nextInt();
			
			
		
			
			switch(input)   { 
			case 1: 
				System.out.println( res + " user mini Van");
				break;
				
			case 2: 
				System.out.println( res + " A Chevy Astro");
				break;
				
			case 3: 
				System.out.println( res + " a broom");
				break;
			
			case 4: 
				System.out.println( res + " Thank you for playing");
				break; 
				
				
				
			}
			
		}
				
				
	}

  }
