package OOPS_Concepts;

public class Vehicle {

	private String name;
	private String size;
	
	private int currentVelocity;
	private int currntDirection;
	
	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		this.currentVelocity=0;
		this.currntDirection=0;
	}
	
	public void steer(int direction) {
		this.currntDirection=direction;
		System.out.println("Vehicle.steer(): Steering at " + this.currntDirection+"degrees.");
	}
	
	public void move(int velocity,int direction) {
		this.currentVelocity=velocity;
		this.currntDirection=direction;
		System.out.println("Velocity.move(): Moving at "+ currentVelocity+ "in direction" +  currntDirection);
	}

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public int getCurrntDirection() {
		return currntDirection;
	}
	
	public void stop() {
		this.currentVelocity=0;
	}
	
	
	
}
