package OOPS_Concepts;

public class Animal_1 {
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	
	Animal_1(String name,int brain, int body, int size, int weight) {
		this.name=name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}

	public void eat() {
		System.out.println("Animal.eat() method is called");
	}
	
	public void move() {
		System.out.println("Animal.move() method is called");
		
	}
	
	public String getName() {
		return name;
	}
	public int getBrain() {
		return brain;
	}

	public int getBody() {
		return body;
	}

	public int getSize() {
		return size;
	}

	public int getWeight() {
		return weight;
	}
	
	
	
}
