// Hua Chen 305942655

package lab5;
import java.util.ArrayList;
import java.util.Scanner;

public class monsterAttack {

	private String monsterAttack;
	private String monster;
    private String date;
    private int month;
    private int day;
    private int year;
    private String location;
    private String name;
    private int id;
//    private String sentence = toString(id, monster, location, month, day, year, name);
        
	public void addAttack() {
		Scanner in = new Scanner(System.in);
		String monster = monster(in);
		String date = date(in);
		int month = month(in, date);
		int day = day(in, date);
		int year = year(in, date);
		String name = name(in);
		String location = location(in);
		int id = id(in);
		String monsterAttack = toString(id, monster, location, month, day, year, name);;
		System.out.println(monsterAttack);
		attackMonitor sendMonsterAttack = new attackMonitor();	
	}

	public String location(Scanner in) {
		System.out.println("What is the location name?: ");
		String location =  in.nextLine();
		return location;	
	}
	public String name(Scanner in) {
		System.out.println("What is the name of the reporter?: ");
		String name =  in.nextLine();
		return name;	
	}
	public String date(Scanner in) {
		System.out.println("What is the date?: ");
		String date =  in.nextLine();
		int numChars = date.length();
		while(numChars != 10 || date.charAt(2) != '/' || date.charAt(5) != '/') {
			System.out.println("Please enter date as MM/DD/YYYY");
			date =  in.nextLine();
			numChars = date.length();
		}return date;	
	}
	public int month(Scanner in, String date) {
		int month = Integer.parseInt(date.substring(0,2));	
		while(month > 12) {
			System.out.println("Please enter a valid month");
			month = in.nextInt();
		}return month;
	}
	public int day(Scanner in, String date) {
		int day = Integer.parseInt(date.substring(3,5));	
		while(day > 31) {
			System.out.println("Please enter a valid day");
			day = in.nextInt();
		}return day;
	}
	public int year(Scanner in, String date) {
		int year = Integer.parseInt(date.substring(7,10));		
		return year;
	}
	public String toString(int id, String monster, String location, int month, int day, int year , String name) {
		String sentence = "Attack# " + id + ": " + monster + " attacked " + location + " on " + month + "/" + day + "/" + year + ". Reported by " + name + ".";
		return sentence;
	}
	public String monster(Scanner in) {
		System.out.println("What is the monsters name?: ");
		String monster =  in.nextLine();
		return monster;	
	}
	public int id(Scanner in) {
		System.out.println("What is the attack id?: ");
		int id =  in.nextInt();
		return id;	
	}
	
/*	public int getId(driver list, ArrayList<String> monsterAttackList) {
		for(int i = 0; i < monsterAttackList.size(); i++) {
		int getID = Integer.parseInt(monsterAttackList.get(i).substring(3, 5));

		}
*/	}
