package demo;

import java.util.Scanner;

public class Main {
	 	
				public static void main(String[]args) {
	 			
	 				 	Scanner myScanner = new Scanner(System.in);
	 				 	// Wait for user to enter a line of text
	 					System.out.println("Enter an integer:");
	 				
	 					//Output the prompt
	 					int intNum = myScanner.nextInt();
	 					
	 					// Tell user what they have entered
	 					System.out.println("You enterd: " + intNum);
	 		
	 			}
	 }