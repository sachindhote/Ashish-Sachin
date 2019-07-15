package OOPS_Concepts;

public abstract class BirdAbstract_3 extends AnimalAbstract_2{

	public BirdAbstract_3(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName()+" is picking");
		
	}

	@Override
	public void breathe() {
		System.out.println("Breathe in, breathe out, repeat");
	}
	
	public abstract void fly();
	
	

}
