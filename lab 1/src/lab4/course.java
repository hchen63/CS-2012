package lab4;
import java.util.Scanner;
import java.util.Scanner;

public class course {
	private int units;
	private String cId;
	
	public course(String cId, int units) {
		Scanner in = new Scanner(System.in);
		this.cId = cId;
		this.units = units;
	}
	public int getUnits() {
		return units;
	}
	public String cId() {
		return cId;
	}

}
