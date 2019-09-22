// Hua Chen 305942655

package lab;
import java.util.Scanner;
public class lab3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String monster = monster(in);
		String date = date(in);
		int month = month(in, date);
		int day = day(in, date);
		int year = year(in, date);
		String name = name(in);
		String location = location(in);
		int attackNum = attackNum(in);
		String monsterAttack = "Attack# " + attackNum + ": " + monster + " attacked " + location + " on " + month + "/" + day + "/" + year + ". Reported by " + name + " .";
		System.out.println(monsterAttack);
	}
	public static int attackNum(Scanner in) {
		System.out.println("What is the attack id?: ");
		int attackNum =  in.nextInt();
		while(!in.hasNextInt() || attackNum < 0){
			if(!in.hasNextDouble()){
				in.next();
				System.out.print("Needs to be interger. ");
				System.out.print("Enter a value for the attack id: ");
			}
			if(attackNum < 0){
				System.out.print("Needs to be nonnegative. ");
				System.out.print("Enter a value for the attack id: ");
				attackNum =  in.nextInt();
			}
		}return attackNum;	
	}
	
	public static String monster(Scanner in) {
		System.out.println("What is the monsters name?: ");
		String monster =  in.nextLine();
		return monster;	
	}
	public static String location(Scanner in) {
		System.out.println("What is the location name?: ");
		String location =  in.nextLine();
		return location;	
	}
	public static String date(Scanner in) {
		System.out.println("What is the date?: ");
		String date =  in.nextLine();
		int numChars = date.length();
		while(numChars != 10 || date.charAt(2) != '/' || date.charAt(5) != '/') {
			System.out.println("Please enter date as MM/DD/YYYY");
			date =  in.nextLine();
			numChars = date.length();
		}return date;	
	}
	public static int month(Scanner in, String date) {
		int month = Integer.parseInt(date.substring(0,2));	
		while(month > 12) {
			System.out.println("Please enter a valid month");
			month = in.nextInt();
		}return month;
	}
	public static int day(Scanner in, String date) {
		int day = Integer.parseInt(date.substring(3,5));	
		while(day > 31) {
			System.out.println("Please enter a valid day");
			day = in.nextInt();
		}return day;
	}
	public static int year(Scanner in, String date) {
		int year = Integer.parseInt(date.substring(7,10));		
		return year;
	}
	
	public static String name(Scanner in) {
		System.out.println("What is the name of the reporter?: ");
		String name =  in.nextLine();
		return name;	
	}
}
