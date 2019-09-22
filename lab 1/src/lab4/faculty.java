package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class faculty extends person{	
	private String fId;
	private ArrayList<course> teach = new ArrayList<course>();

	public faculty(String name, lab4.address address, String fId) {
		super(name, address);
		this.fId = fId;
	}
	public void setteach(ArrayList<course> teach) {
	    this.teach = teach;
	}
	public ArrayList<course> getTeach(Scanner in) {
		return teach;
		
	}public void addTeach(course course){
		teach.add(course);
    }

    public void removeTeach(course course){
    	teach.remove(course);
    }

}

