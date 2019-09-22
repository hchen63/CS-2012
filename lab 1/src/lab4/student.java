package lab4;
import java.util.Scanner;
import java.util.ArrayList;

public class student extends person{
	private double GPA;
	private ArrayList<course> courses= new ArrayList<course>();
	
	
	public student(String name, address address, double GPA) {
		super(name, address);
		this.GPA = GPA;
		String student = toString(address, GPA, name);
		System.out.println(student);
		
	}
	public void setGPA(double GPA) {
        this.GPA = GPA;
    }
	public double getGPA() {
        return GPA;
    }  
	public void setCourses(ArrayList<course> courses) {
	    this.courses = courses;
	}
	public ArrayList<course> getCourses(Scanner in) {
		return courses;
		
	}public void addCourse(course course){
        courses.add(course);
    }

    public void removeCourse(course course){
        courses.remove(course);
    }

	public String toString(address address, double GPA, String name) {
		String Student = name + " lives at " + address + " with a GPA of " + GPA;
		return Student;
	}
}
