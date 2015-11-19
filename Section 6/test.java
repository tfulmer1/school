package classes;
import java.util.Scanner;


public class Baby {
	Double babyfood;  
	String babyname;
	   int babyage;
	 
	   
	   private void nameBaby (String name){ 
		   babyname=name;
		   }
	   private String getnameBaby(){
		   return babyname;
	   }
	   private void feedBaby(Double milk){ // in oz
			  	babyfood= milk;
		  }
	   
	   private Double getFeedBaby(){
		return babyfood;
	   }
	  
	   private void setAge(int weeks){ // baby age in weeks
		 babyage=weeks;	
	   }
	   private int getAge(){
		  return babyage;
	   }
	
	

	

	   public static void main (String[] args) {
		   Scanner keyboard = new Scanner(System.in); 
		   Baby firstBaby = new Baby();
		   
		    System.out.println("What is baby's name?");
		    String name = keyboard.nextLine();
		   
		    System.out.println("How much milk are you giving to your baby?");
		    Double milk= keyboard.nextDouble();
		    
		    System.out.println("How many weeks is your baby?");
		    int weeks=keyboard.nextInt(); 
				  
				  
		 firstBaby.nameBaby(name);
		 firstBaby.feedBaby(milk);
		 firstBaby.setAge(weeks);
		   
		
		
		   System.out.println("Your baby "+ firstBaby.getnameBaby() + " eats "+ firstBaby.getFeedBaby() +" oz of milk. "+"He is "+ firstBaby.getAge() +" weeks old.");

	      
	  

		
	}
	}

