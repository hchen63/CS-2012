package lab7;

import java.util.ArrayList;

public class Bird extends Prey{
	private double weight;
	private String name;

	public Bird(double weight, String name) {
		this.weight = weight;	
		this.name = name;
	}

	public void flee() {
		ArrayList<String> birdFlee = new ArrayList<String>(2);	
		birdFlee.add(" flys away.");
		birdFlee.add(" bolts away.");	
		System.out.println(getName() + birdFlee.get((int)(0 + (Math.random() * ((1 - 0) + 1)))));
	}
	public String eat() {
		String Food = "worms";
		return Food;
	}
	public void call() {
		System.out.println(getName() + " says Chrip");		
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


