package com.sc.oops.conditional_statements;

public class Conditional_Statements {

	public void if_method(int mark, String stud) {
		
		if(mark >=1 && mark <=100) {//========================================================
		       if(mark >=40 && mark <=80) {//40 to 80
			
			System.out.println("The Student:" +stud +"The mark:" +mark+"is above average");
			
		}
		
		else if(mark>80 && mark!=100) {//81 to 99
			
			System.out.println("The Student:" +stud +"The mark:" +mark+"is highest");
		}
		
        else if(mark== 100) {//==100
			
			System.out.println("The Student:" +stud +"The mark:" +mark+"is centum");
		}
		
		
		else {//1 to 39
			
			System.out.println("The Student:" +stud +"The mark:" +mark+ "is fail ");
		}}//=====================================
		
		else {
			System.out.println("The mark:" +mark+" is not applicable");
		}
		
	}
	public static void main(String[] args) {
		
		Conditional_Statements cs = new Conditional_Statements();
		cs.if_method(89, "Rose");

	}

}
