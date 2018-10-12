package weektwo;

public class conditionals {
	
	public static void main(String[] args) {
		
		 String name = "Tom";
		
		 if (name == "Tom") {
			System.out.println("Tom is my best friend");
		}
		
		int age = 7; 
		 if (age >= 16) { 
			 	System.out.println("You can get a driver's license");
			 	
		 } else { 
			 System.out.println("You need to wait " + (16 - age) + " years until you can get a drivers license.");
			 
			 
		 }
		 double priceofmilk = .99;
		 
		 	if (priceofmilk < 2)  {
		 			System.out.println("Buy 2 gallons milk");
		 	} else if (priceofmilk < 3) { 
		 			System.out.println("Buy 1 gallon of milk");
		 			
		 	} else { 
		 			System.out.println("Not buying any of the super expensive milk!");
		 			
		 			
		 	}
		 	
		 	char grade = 'B'; 
		 	
		 	switch (grade) { 
		 	
		 	case 'A': 
		 			System.out.println("90 - 100");
		 			break;
		 	
		 	case 'B': 
		 			System.out.println("80 - 89");
		 			break;
		 			
		 	case 'C': 
		 			System.out.println("70 - 79"); 
		 			break;
		 			
		 	case 'D': 
		 			System.out.println("60 - 69");
		 			break;
		 			
		 	case 'F':
		 			System.out.println("0 - 59"); 
		 			break;
		 			
		 	default: 
		 			System.out.println("Invalid Grade.");
		 	
		}
		 	
		 	
		 	if  (1 == 1) {
		 			System.out.println("At least the first is true.");
		 		if (2 == 2) {
		 			System.out.println("Both are true.");
		 			
		 			
		 			
		 			
		 			
		 		}
		 		
		 		
		 		
		 	}
		
		}
	
	}

 
