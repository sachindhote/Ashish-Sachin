package OOPS_Concepts;

public class DogAbstract_2 extends AnimalAbstract_2{

	public DogAbstract_2(String name) {
		super(name);
		
	}

	@Override
	public void eat() {
		System.out.println(getName()+" is eating");
		
	}

	@Override
	public void breathe() {
		System.out.println("Breathe in, breathe out, repeat");
		
	}
}
