package com.wipro.milestone1.TM3.interfaces.Ques1;

public class AdultsUser implements LibraryUser{
	private int age;
	private String bookType;
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getBookType() {
		return bookType;
	}


	public void setBookType(String bookType) {
		this.bookType = bookType;
	}


	
	public void registerAccount(int age) {
		
		if(getAge() <= 0 || getAge() >= 130){
			System.out.println("Invalid Age of Adults.\n");
		}
		else if(getAge() < 12){
			System.out.println("Sorry, Age must be greater than 12 to register as an adult.\n");
		}else System.out.println("You have successfully registered under an Adult Account.\n");
		
	}

	
	public void requestBook(String bookType) {
		
		if(getBookType().equalsIgnoreCase("")){
			System.out.println("Please Enter book type.\n");
		}
		else if(getBookType().equalsIgnoreCase("Fiction")){
			System.out.println("Book Issued successfully, please return the book within 7 days.\n");
		}else System.out.println("Oops, you are allowed to take only adult Fiction books.\n");
	}

}
