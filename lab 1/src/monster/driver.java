//Hua Chen 305942655

package monster;

import java.util.ArrayList;
import java.util.Scanner;

public class driver {
	private ArrayList<String> monsterAttackList;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> monsterAttackList = new ArrayList<String>(100);
		attackMonitor mon = new attackMonitor();
		mon.monitor();
		
	}

}
	