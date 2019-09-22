package lab4;
import java.util.Scanner;
public class address {
	private int stNum;
	private String stName;
	private String city;
	private int postalCode;
	private String country;
	
	public void setAddress(int stNum, String stName, String city, int postalCode, String country) {
		Scanner in = new Scanner(System.in);
		this.stNum = stNum;
		this.stName = stName;
		this.city = city;
		this.country = country;
		this.postalCode = postalCode;
	}
	
	
	public int getStNum(Scanner in) {
//		System.out.println("Enter street number:");
		int stNum = in.nextInt();
		return stNum;
	}
	public String getStName(Scanner in) {
//		System.out.println("Enter street name:");
		String stName = in.nextLine();
		return stName;
	}
	public int getPostalCode(Scanner in) {
//		System.out.println("Enter postal code:");
		int postalCode = in.nextInt();
		return postalCode;
	}
	public String getCity(Scanner in) {
//		System.out.println("Enter city:");
		String city = in.nextLine();
		return city;
	}
	public String getCountry(Scanner in) {
//		System.out.println("Enter country:");
		String country = in.nextLine();
		return country;
	}

	public String toString(int stNum, String stName, String city, int postalCode, String country) {
		String getAddress = stNum + " " + stName + " " + city + " " + postalCode + " " + country;
		return getAddress;
	}
}
