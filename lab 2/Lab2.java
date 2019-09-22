// Hua Chen 305942655

package cs;
import java.util.Scanner;
import java.util.ArrayList;
public class Lab2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = size(in);
		ArrayList<Double> arrayList = initUserInput(size, in);
		ArrayList<Double> finalArray = finalInit(size,in,arrayList);
		ArrayList<Double> reciprocalArray = new ArrayList<Double>();
		reciprocalArray = reciprocalArray(finalArray, size, reciprocalArray);
		
		printArray(finalArray);
		printCubeArray(finalArray, size);
		printReciprocalArray(reciprocalArray);
	}
	public static int size(Scanner in) {
		System.out.println("What is the size of the array list?: ");
		int size =  in.nextInt();
		return size;				
	}
	
	public static ArrayList<Double> initUserInput(int size, Scanner in) {
		ArrayList<Double> arrayList = new ArrayList<>();
		for (int i = 0 ; i < size ; i++) {
			System.out.print("Enter a value for a array: "); 
			arrayList.add(in.nextDouble());
		
			while(arrayList.get(i) < 0){
				System.out.print("Needs to be nonnegative. ");
				System.out.print("Enter a value for the array: ");
				arrayList.set(i, in.nextDouble());
			}
		}return arrayList;
	}
	
	public static ArrayList<Double> finalInit(int size, Scanner in, ArrayList<Double> arrayList) {
		for (int i = 0 ; i < size ; i++) {				
			if(arrayList.get(i) > 999) {
				arrayList.set(i, 999.0);
			}		
		}return arrayList;
	}
	
	public static void printArray(ArrayList<Double> finalArray) {
		System.out.print("You entered: " + finalArray);
	}
	
	public static void printCubeArray(ArrayList<Double> finalArray, int size) {
		System.out.print("\nYour cubed array is: ");
		for (int i = 0 ; i < size ; i++) {
			System.out.print(Math.pow(finalArray.get(i), 3) + " ");
		}
	}
	
	public static ArrayList<Double> reciprocalArray(ArrayList<Double> finalArray, int size, ArrayList<Double> reciprocalArray) {		
		for (int i = 0 ; i < size ; i++) {
			reciprocalArray.add(i, 1/finalArray.get(i));
		}return reciprocalArray;
	}
	
	public static void printReciprocalArray(ArrayList<Double> reciprocalArray) {
		System.out.print("\nYour reciprocal array is: " + reciprocalArray);
	}
}


