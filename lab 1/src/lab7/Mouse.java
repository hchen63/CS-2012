package lab7;

import java.util.ArrayList;

public class Mouse extends Prey{
	private double weight;
	private String name;
	
	public Mouse(double weight, String name) {
		this.name = name;
		this.weight = weight;
		
	}
	public void flee() {
		System.out.println(getName() + " scampers away.");
	}
	public String eat() {
		String Food = "cheese";
		return Food;
	}
	public void call() {
		System.out.println(getName() + " says Squeek");
	}
	public double getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		double foodWeight = 0 + (Math.random() * ((10 - 0) + 10));
		String eat = (getName() + " eats " + (getWeight()+foodWeight) + " grams of "+ eat());
		return eat;
	}
	
	
}
