package OOPS_Concepts;

public abstract class AnimalAbstract_2 {

	private String name;

	public AnimalAbstract_2(String name) {
		super();
		this.name = name;
	}
	
	public abstract void eat();
	public abstract void breathe();

	public String getName() {
		return name;
	}
	
}
