package com.sc.oops.conditional_statements;

import java.util.Scanner;

public class Switch_demo {
	
	public void hotel() {
		
		System.out.println("Enter the Choice (1.Briyani,2.Fried Rice, 3.Salad, 4.Juice");
		
		Scanner scan =new Scanner(System.in);
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
		System.out.println("You have ordered Briyani");
		break;
		
	    case 2:
		System.out.println("You have ordered Fried Rice");
	    break;
	
        case 3:
	    System.out.println("You have ordered Salad");
        break;

       case 4:
	    System.out.println("You have ordered Juice");
	    break;
	    
	    default:
	    	System.out.println("Your Order is not in the menu");
}
	}

	public static void main(String[] args) {
		
		Switch_demo sd =new Switch_demo();

		sd.hotel();
	}

}
