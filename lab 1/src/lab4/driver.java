package lab4;
import java.util.ArrayList;
import java.util.Scanner;
public class driver {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		university uni = new university();
		ArrayList<student> sList = new ArrayList<student>();
	    ArrayList<course> cList = new ArrayList<course>();
	    ArrayList<faculty> fList = new ArrayList<faculty>();
		System.out.println("Enter 1 for adding student \n"
				+ "2 for deleting an student \n"
				+ "3 for adding an faculty \n"
				+ "4 for deleting a faculty \n"
				+ "5 for deleting a course form the course list \n"
				+ "6 for displaying student \n"
				+ "7 for displaying course \n"
				+ "8 for displaying faculty \n"
				+ "any other number to exit");
		int choice = in.nextInt();	
		switch (choice) {
    	case 1:
    		uni.addStudent(in);
    		break;
    	case 2:
    		uni.removeStudent(in);
    		break;
    	case 3:
    		uni.addFaculty(in);
    		break;
    	case 4:
    		uni.removeFaculty(in);
    		break;
    	case 5:
    		uni.removeCourse(in);
    		break;
    	case 6:
    		uni.displaySList(sList);
    		break;
    	case 7:
    		uni.displayCList(cList);
    		break;
    	case 8:
    		uni.displayFList(fList);
    		break;
    	case 9:
    		System.exit(0);
    	}		
		
	}

}
