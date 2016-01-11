package com.wipro.milestone1.TM3.interfaces.Ques1;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.corba.se.impl.io.TypeMismatchException;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class LibraryInterfaceDemo {

	
	public static void main(String[] args) {
		boolean flag = true;
		
		while(flag){
		
		try{
			System.out.println("ONLINE LIBRARY SYSTEM");
			System.out.println("---------------------\n");
			System.out.println("Please Enter your choice...");
			System.out.println("1. KIDS.");
			System.out.println("2. Adults.");
			System.out.println("3. Exit.");
			
			KidUsers kid = new KidUsers();
		    AdultsUser adult = new AdultsUser();
		    
	        Scanner sc = new Scanner(System.in);
	        int choice = sc.nextInt();
	        
	        switch(choice){
	        	
	        case 1:
	        	System.out.println("1. Kids Register Account.");
	        	System.out.println("2. Kids Request Book.");
	        	
	        	int choice1 = sc.nextInt();
	        	if(choice1 == 1){
	        		System.out.println("Please Enter Kid Age :");
	        		int age = sc.nextInt();
	        		kid.setAge(age);
	        		kid.registerAccount(kid.getAge());
	        		
	        	}else if(choice1 == 2){
	        		System.out.println("Please Enter Book type :");
	        		String bookType = sc.next();
	        		kid.setBookType(bookType);
	        		kid.requestBook(kid.getBookType());
	        		
	        	}else System.out.println("Invalid Input, Please type 1 or 2 only.\n");
	            break;	
	        case 2:
	        	System.out.println("1. Adults Register Account.");
	        	System.out.println("2. Adults Request Book.");
	        	
	        	int choice2 = sc.nextInt();
	        	if(choice2 == 1){
	        		System.out.println("Please Enter Adult Age :");
	        		int age = sc.nextInt();
	        		adult.setAge(age);
	        		adult.registerAccount(adult.getAge());
	        		
	        	}else if(choice2 == 2){
	        		System.out.println("Please Enter Book type :");
	        		String bookType = sc.next();
	        		adult.setBookType(bookType);
	        		adult.requestBook(adult.getBookType());
	        		
	        	}else System.out.println("Invalid Input, Please type 1 or 2 only.\n");
	            break;	
	        case 3:
	        	flag = false;
	        	System.out.println("Thank you for using Online Library, System Exiting...");
	        	System.exit(0);
	        	break;
	        default:
	        	System.out.println("Invalid Choice, Please enter correct Choice.\n");	
	        }
	           
	    }catch(TypeMismatchException tme){
	    	System.out.println("Please Enter Valid option\n");
	    }catch(InputMismatchException ime){
	    	System.out.println("Please Enter valid Inputs\n");
	    }
		catch(Exception e){
	    	e.printStackTrace();
	    }
	}
	}
}
