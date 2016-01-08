package com.wipro.milestone1.TM3.Abstract.ques2;
import java.util.Random;

public class TestCompartment {
	
	static int min = 1;
	static int max = 4;
	static int randomNum;
	
	
	public static int randint(){
		
		
		Random rand = new Random();
		 randomNum = rand.nextInt((max - min) + 1) + min;
         //System.out.println(randomNum);
		return randomNum;
		
	}
	
	public static void main(String[] args) {
		
		Compartment[] compartment = new Compartment[10];
		
		for(int i = 0; i < 10; i++){
			int num = TestCompartment.randint();
			switch(num){
			
			case 1:
				compartment[i] = new FirstClass();
				break;
			case 2:
				compartment[i] = new Ladies();
				break;
			case 3:
				compartment[i] = new General();
				break;
			case 4:
				compartment[i] = new Luggage();
				break;
			default: System.out.println("Error Occured while generating Random number.");	
			}
		}
		
		for(int i = 0; i < 10; i++){
			compartment[i].notice();
		}
		
	}

}
