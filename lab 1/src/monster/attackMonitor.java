//Hua Chen 305942655

package monster;

import java.util.ArrayList;
import java.util.Scanner;

public class attackMonitor extends monsterAttack{
	private ArrayList<String> monsterAttackList;
	
	public void monitor() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1 for adding new attack\n"
				+ "2 for displaying attacks\n"
				+ "3 for deleting an attack\n"
				+ "4 for saving the list\n"
				+ "5 for clear the list and read a file\n"
				+ "any other number to exit");
		int choice = in.nextInt();
		while(choice < 5 && choice > 0) {
		switch (choice) {
    	case 1:
    		super.addAttack();
    		break;
    	case 2:
    		super.display();
    		break;
    	case 3:
    		super.delete(in, monsterAttackList);
    		break;
    	case 4:
			super.save(monsterAttackList, in);
			break;
		case 5:
			super.clears(monsterAttackList, in);
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
}