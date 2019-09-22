package lab4;
import java.util.Scanner;
public class person {
	private String name;
	private address address;
	

	public person(String name, address address) {
		Scanner in = new Scanner(System.in);
		this.name = name;
		this.address = address;		
	}
	   public void setName(String name) {
	        this.name = name;
	    }
	public String getName(Scanner in) {
		System.out.println("Enter your name: ");
		String name = in.nextLine();
		return name;
	}
	 public void setAddress(address address) {
	        this.address = address;
	    }
	public address getAddress() {
		return address;
	}
}
