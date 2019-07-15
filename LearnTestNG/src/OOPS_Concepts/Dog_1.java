package OOPS_Concepts;

public class Dog_1 extends Animal_1{
	
	private int eyes,legs,tail,teeth;
	private String coat;
	
	
	public Dog_1(String name, int size, int weight,int eyes,int legs,int tail,int teeth,String coat) {
		super(name, 1, 1, size, weight);
		this.eyes=eyes;
		this.legs=legs;
		this.tail=tail;
		this.teeth =teeth;
		this.coat=coat;
	}
	
	private void chew() {
		System.out.println("Dog.chew() method is called");
	}

	@Override
	public void eat() {
		
		System.out.println("Dog.eat() methos is called");
		chew();
		// TODO Auto-generated method stub
		super.eat();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Dog.move() is called");
		super.move();
	}
	
}
