package com.wipro.milestone1.TM3.project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterestCalculator {

	
	public static void main(String[] args) throws NumberFormatException, InputMismatchException {
		
		boolean flag = true;
		//String choice1 = "y";
       
		while(flag){
		//while(choice1.equalsIgnoreCase("y")){
		
        System.out.println("\nSelect the option :\n");
		System.out.println("1. Interest Calculator-SB");
		System.out.println("2. Interest Calculator-FB");
		System.out.println("3. Interest Calculator-RB");
		System.out.println("4. EXIT");
        
        
		
	try{
		FDAccount fda = new FDAccount();
		SBAccount sba = new SBAccount();
		RDAccount rda = new RDAccount();
		
		
		int choice;
		
		Scanner sc = new Scanner(System.in);
	    choice = sc.nextInt();
	    
		if(choice == 1){
			sba.calculateInterest();
		}
		else if(choice == 2){
			fda.calculateInterest();
		}
		else if(choice == 3){
			rda.calculateInterest();
		}
		else if(choice == 4){
			flag = false;
			System.out.println("Thank you for using our Service. Exiting...");
			System.exit(0);
		}
		else System.out.println("Please enter valid Option");
	}

	    catch(InputMismatchException ime){
	    	System.out.println("Please Enter Integer Only");
	    }
		catch(NumberFormatException nfe){
			System.out.println("Please provide correct number format");
			//nfe.printStackTrace();
		}
		catch(Exception e){
			System.out.println("Some error occured, Please try again later.");
			e.printStackTrace();
		}
	//System.out.println("\nPress y to continue and other to exit");
    //Scanner sc = new Scanner(System.in);
    
    //choice1 = sc.nextLine();
    //if(!choice1.equalsIgnoreCase("y")){
    	//System.out.println("Thank you for using our service. System Exiting...");
    	//System.exit(0);
    //}
	
}
	}

}
