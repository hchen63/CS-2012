package exa;
import java.util.Scanner;
public class ex {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		sg set = new sg();
		
		sg.setLocation(location());
		
//		 String tod = sg.getLocation();  
//		 System.out.println(location: " + tod);  
		
	}

	private static void location() {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the location name?: ");
		String location =  in.nextLine();
	}

}
