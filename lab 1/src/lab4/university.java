//Hua Chen 305942655

package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class university {
	Scanner in = new Scanner(System.in);
	address setAddress = new address();
//	student setGPA = new student();
//	person setName = new person(name, address);
    ArrayList<student> sList = new ArrayList<student>();
    ArrayList<course> cList = new ArrayList<course>();
    ArrayList<faculty> fList = new ArrayList<faculty>();
    
    public void displaySList(ArrayList<student> sList) {
    	System.out.println(sList);   	
    }
    public void displayCList(ArrayList<course> cList) {
    	System.out.println(cList);   	
    }
    public void displayFList(ArrayList<faculty> fList) {
    	System.out.println(fList);   	
    }
    
    public void addStudent(Scanner in) {
    	System.out.println("Enter street number: ");
    	int stNum = setAddress.getStNum(in);  	
    	System.out.println("Enter postal code: ");
    	int postalCode = setAddress.getPostalCode(in);
    	System.out.println("Enter city: ");
    	String city = setAddress.getCity(in);
    	System.out.println("Enter country: ");
    	String country = setAddress.getCountry(in);   	
    	System.out.println("Enter street name: ");
    	String stName = setAddress.getStName(in);
    	System.out.println("Enter name: ");
    	String name = in.nextLine();
    	System.out.println("Enter GPA: ");
    	double GPA = in.nextDouble();
    	student student = new student(name, setAddress, GPA);
    	sList.add(student);		
    	System.out.println(student);    	
    }
    public void removeStudent(Scanner in) {
    	System.out.println("Enter street number: ");
    	int stNum = setAddress.getStNum(in);  	
    	System.out.println("Enter postal code: ");
    	int postalCode = setAddress.getPostalCode(in);
    	System.out.println("Enter city: ");
    	String city = setAddress.getCity(in);
    	System.out.println("Enter country: ");
    	String country = setAddress.getCountry(in);   	
    	System.out.println("Enter street name: ");
    	String stName = setAddress.getStName(in);
    	System.out.println("Enter name: ");
    	String name = in.nextLine();
    	System.out.println("Enter GPA: ");
    	double GPA = in.nextDouble();
    	student student = new student(name, setAddress, GPA);
    	sList.remove(student);		
    	System.out.println(student);    	
    }
    public void addFaculty(Scanner in) {
    	System.out.println("Enter street number: ");
    	int stNum = setAddress.getStNum(in);  	
    	System.out.println("Enter postal code: ");
    	int postalCode = setAddress.getPostalCode(in);
    	System.out.println("Enter city: ");
    	String city = setAddress.getCity(in);
    	System.out.println("Enter country: ");
    	String country = setAddress.getCountry(in);   	
    	System.out.println("Enter street name: ");
    	String stName = setAddress.getStName(in);
    	System.out.println("Enter name: ");
    	String name = in.nextLine();
    	System.out.println("Enter faculty Id: ");
    	String fId = in.nextLine();
    	faculty faculty= new faculty(name, setAddress, fId);
    	fList.add(faculty);		
    	System.out.println(faculty);    	
    }
    public void removeFaculty(Scanner in) {
    	System.out.println("Enter street number: ");
    	int stNum = setAddress.getStNum(in);  	
    	System.out.println("Enter postal code: ");
    	int postalCode = setAddress.getPostalCode(in);
    	System.out.println("Enter city: ");
    	String city = setAddress.getCity(in);
    	System.out.println("Enter country: ");
    	String country = setAddress.getCountry(in);   	
    	System.out.println("Enter street name: ");
    	String stName = setAddress.getStName(in);
    	System.out.println("Enter name: ");
    	String name = in.nextLine();
    	System.out.println("Enter faculty Id: ");
    	String fId = in.nextLine();
    	faculty faculty= new faculty(name, setAddress, fId);
    	fList.remove(faculty);		
    	System.out.println(faculty);    	
    }
    public void removeCourse(Scanner in) {
    	System.out.println("Emter course Id to remove: ");
    	String id = in.nextLine();
    	cList.remove(id);
    }
}