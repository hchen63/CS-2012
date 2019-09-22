// Hua Chen 305942655

package monster;
import java.io.File;
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
		String monsterAttack = "Attack# " + id + ": " + monster + " attacked " + location + " on " + month + "/" + day + "/" + year + ". Reported by " + name + ".";
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
	public String sentence(int attackNum, String monster, String location, int month, int day, int year , String name) {
		String monsterAttack = "Attack# " + id + ": " + monster + " attacked " + location + " on " + month + "/" + day + "/" + year + ". Reported by " + name + ".";
		return monsterAttack;
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
	
	public void display() {	
		ArrayList<String> monsterAttackList = new ArrayList<String>();
		monsterAttackList.add("Attack # 125: Godzilla attacked Tokyo on 6/25/2009. Reported by Kyohei Yamane");
		monsterAttackList.add("Attack # 1: Megalodon attacked Pacific on 8/10/2018. Reported by Jon Turteltaub");
		monsterAttackList.add("Attack # 12: Yeti attacked Himalayas on 6/25/1832. Reported by Scooby Doo");
		for(int i = 0; i < monsterAttackList.size(); i++) {   
		    System.out.print(monsterAttackList.get(i).toString());
		}  	
	}
	
	public void delete(Scanner in, ArrayList<String> monsterAttackList) {		
		System.out.println("Enter the attack id to delete");
		int num = in.nextInt();   
		monsterAttackList.remove(num);
	}
	
	public static void save(ArrayList<String> monsterAttackList, Scanner in) {
		System.out.println("Enter file to copy to");
		File outFile = new File(in.next());
		Scanner fCopy;
		try {
			fCopy = fCopy = new Scanner(outFile);
			fCopy.nextLine();
			String line;
			String[] fields;
			String monster;
			String date;
			int month;
			int day;
			int year;
			String name;
			String location;
			int id;
			
			while(fCopy.hasNextLine()) {
				line = fCopy.nextLine();
				fields = line.split(",");
				id = Integer.parseInt(fields[0]);
				monster = fields[1];
				location = fields[2];
				month = Integer.parseInt(fields[3]);
				day = Integer.parseInt(fields[4]);
				year = Integer.parseInt(fields[5]);
				name = fields[6];
				String monsterAttack = "Attack# " + id + ": " + monster + " attacked " + location + " on " + month + "/" + day + "/" + year + ". Reported by " + name + ".";
				monsterAttackList.add(monsterAttack);
			}			
		}
		catch (Exception e) {
	         System.out.println("Exception occurred");
	      }
	}
	public static void clears(ArrayList<String> monsterAttackList, Scanner in) {
		monsterAttackList.clear();
		System.out.println("Enter file to read");
		File inFile = new File(in.next());
		Scanner fReader;
		try {
			fReader = fReader = new Scanner(inFile);
			fReader.nextLine();
			String line;
			String[] fields;
			String monster;
			String date;
			int month;
			int day;
			int year;
			String name;
			String location;
			int id;
			
			while(fReader.hasNextLine()) {
				line = fReader.nextLine();
				fields = line.split(",");
				id = Integer.parseInt(fields[0]);
				monster = fields[1];
				location = fields[2];
				month = Integer.parseInt(fields[3]);
				day = Integer.parseInt(fields[4]);
				year = Integer.parseInt(fields[5]);
				name = fields[6];
				String monsterAttack = "Attack# " + id + ": " + monster + " attacked " + location + " on " + month + "/" + day + "/" + year + ". Reported by " + name + ".";
				monsterAttackList.add(monsterAttack);
			}			
		}
		catch (Exception e) {
	         System.out.println("Exception occurred");
	      }
			
		}			
	}	
