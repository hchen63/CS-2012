//Hua Chen 305942655

package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class attackMonitor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		monsterAttack addAttack = new monsterAttack();	
		driver list = new driver();
		ArrayList<String> monsterAttackList = new ArrayList<String>(100);
		
		System.out.println("Enter 1 for adding new attack\n"
				+ "2 for displaying attacks\n"
				+ "3 for deleting an attack\n"
				+ "4 for saving the list\n"
				+ "5 for clear the list and read a file\n"
				+ "any other number to exit");
		int choice = in.nextInt();
		while(choice < 6 && choice > 0) {
			switch (choice) {
			case 1:
				add(in, addAttack, monsterAttackList);
				break;
			case 2:
				display(list, monsterAttackList);
				break;
			case 3:
				delete(in, monsterAttackList);
				break;  	
			case 4:
				save(monsterAttackList, in, addAttack);
				break;
			case 5:
				clears(monsterAttackList, in, addAttack);
				break;
			case 6:
				System.exit(0);
    	}	
			System.out.println("Enter 1 for adding new attack\n"
					+ "2 for displaying attacks\n"
					+ "3 for deleting an attack\n"
					+ "4 for saving the list\n"
					+ "5 for clear the list and read a file\n"
					+ "any other number to exit");	
			choice = in.nextInt();
		}
	}
	public static void add(Scanner in, monsterAttack addAttack, ArrayList<String> monsterAttackList) {
		String monster = addAttack.monster(in);
		String date = addAttack.date(in);
		int month = addAttack.month(in, date);
		int day = addAttack.day(in, date);
		int year = addAttack.year(in, date);
		String name = addAttack.name(in);
		String location = addAttack.location(in);
		int id = addAttack.id(in);
		String monsterAttack = addAttack.toString(id,monster,location, month, day , year , name);
		monsterAttackList.add(monsterAttack);
	}
	
	public static void display(driver list, ArrayList<String> monsterAttackList) {
		
		monsterAttackList = list.monsterList(monsterAttackList);
		System.out.println(monsterAttackList);		
	}
	public static void delete(Scanner in, ArrayList<String> monsterAttackList) {		
		System.out.println("Enter the attack id to delete");
		int num = in.nextInt();   
		monsterAttackList.remove(num);	
	}
	public static void save(ArrayList<String> monsterAttackList, Scanner in, monsterAttack addAttack) {
		System.out.println("Enter file to copy to");
		File outFile = new File(in.next());
		Scanner fCopy;
		try {
			fCopy = fCopy = new Scanner(outFile);
			fCopy.nextLine();
			String line;
			String[] fields;
			String monster = addAttack.monster(in);
			String date = addAttack.date(in);
			int month = addAttack.month(in, date);
			int day = addAttack.day(in, date);
			int year = addAttack.year(in, date);
			String name = addAttack.name(in);
			String location = addAttack.location(in);
			int id = addAttack.id(in);
			
			String fileList = + id + ", " + monster + ", " + location + ", " + month + "/" + day + "/" + year + ", " + name;
			((List<String>) outFile).add(fileList);		
		}
		catch (Exception e) {
	         System.out.println("Exception occurred");
	      }
	}
	public static void clears(ArrayList<String> monsterAttackList, Scanner in, monsterAttack addAttack) {
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
				String monsterAttack = addAttack.toString(id,monster,location, month, day , year , name);
				monsterAttackList.add(monsterAttack);
			}			
		}
		catch (Exception e) {
	         System.out.println("Exception occurred");
	      }
			
		}			
	}	
