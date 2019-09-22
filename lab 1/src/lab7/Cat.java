package lab7;

import java.util.ArrayList;

public class Cat extends Predator{
	
	private double weight;
	private String name;
	
	public Cat(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public void predate(Prey p) {
		eat(p);
	}
	public void eat(Prey p) {
		System.out.println(getName() + " eats " + p + " for " + getWeight()+ " grams");
	}
	public static void preyName() {
		Prey p;
		
	}
	public void call() {
		String call = getName() + " says Meow";	
		System.out.println(call);
	}
	public double getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return getName() + " is a cat weighing " + getWeight() + " grams.";
	}	
}

