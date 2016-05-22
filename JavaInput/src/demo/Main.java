package demo;

	//Input using array
import java.util.Scanner;

public class Main {
	 	
	private static Scanner myScanner = new Scanner(System.in);

		public static void main(String[] args) {
		
			int[] myInt = getIntArray(3);
			printArray(myInt);

		}
	
		//getting user input using array
		public static int[] getIntArray(int volume) {
			int[] array =  new int[volume];
			System.out.println("Enter "+volume +" integers: \r");
			for (int i=0; i<array.length; i++){
				array[i] = myScanner.nextInt();
			}
			return array;
		
		}
		
		//Printing array
		public static void printArray(int[] array){
			for (int i=0; i<array.length; i++){
				System.out.println("Index array "+i+ " contains " + array[i]);
			}
		}
	}
