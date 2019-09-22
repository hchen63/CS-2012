//Hua Chen 305942655

package lab1;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class attackMonitor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int size = size(in);
		ArrayList<String> monsterAttack = new ArrayList<>();	
}	
	public static void monitor(){
    	int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for adding new attack, 2 for displaying attacks, 3 for deleting an attack, any other number to exit"));
    	switch (choice) {
    	case 1:
 //   		addAttack();
    		break;
    	case 2:
//    		display();
    		break;
    	case 3:
///    		delete();
    		break;
    	case 4:
    		System.exit(0);
    }
	}
}
    

//	public static void display() {
//		System.out.println(monsterAttack);
//	}
	
//	public static void delete() {
//		 int delete = Integer.parseInt(JOptionPane.showInputDialog("Please enter the attack id which has to be deleted"));
//		 if(delete == id)
//	}
		
	