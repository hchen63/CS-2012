//Hua Chen 305942655


package lab1;
import java.util.Scanner;
public class Hw01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = 10;
		
		double[] doubleArray = initUserInput(size, in);
		double[] doubleReciprocalArray = new double[size];
		double[] finalArray = finalInit(size,in,doubleArray);	
		
		printArray(finalArray);
		printCubeArray(finalArray, size);
		reciprocalArray(finalArray, size, doubleReciprocalArray);
		printReciprocalArray(doubleReciprocalArray, size);
	}
	
	public static double[] initUserInput(int size, Scanner in) {
		double[] doubleArray = new double[size];
		for (int i = 0 ; i < size ; i++) {
			System.out.print("Enter a value for a array: ");					
			
				while(!in.hasNextDouble()){
					in.next();
					System.out.print("Needs to be double. ");
					System.out.print("Enter a value for the array: ");
				}
				doubleArray [i] = in.nextDouble();
			
				while(doubleArray [i] < 0){
					System.out.print("Needs to be nonnegative. ");
					System.out.print("Enter a value for the array: ");			
					doubleArray [i] = in.nextDouble();
				}
		}return doubleArray;
	}
	
	public static double[] finalInit(int size, Scanner in, double[] doubleArray) {
		for (int i = 0 ; i < size ; i++) {				
			if(doubleArray [i] > 999) {
				doubleArray [i] = 999;
			}		
		}return doubleArray;
	}
	
	public static void printArray(double[] finalArray) {
		System.out.print("You entered: ");
		for (int i = 0 ; i < 10 ; i++) {
			System.out.print(finalArray[i] + " ");
		}
		System.out.print("for your array.");
	}
	
	public static void printCubeArray(double[] finalArray, int size) {
		System.out.print("\nYour cubed array is: ");
		for (int i = 0 ; i < size ; i++) {
			System.out.print(Math.pow(finalArray[i], 3) + " ");
		}
	}
	
	public static double[] reciprocalArray(double[] finalArray, int size, double[] doubleReciprocalArray) {
		for (int i = 0 ; i < size ; i++) {
			doubleReciprocalArray [i] = 1/finalArray[i];
		}return doubleReciprocalArray;
	}
	
	public static void printReciprocalArray(double[] doubleReciprocalArray, int size) {
		System.out.print("\nYour reciprocal array is: ");
		for (int i = 0 ; i < size ; i++) {
			System.out.print(doubleReciprocalArray[i] + " ");
		}
	}
}

