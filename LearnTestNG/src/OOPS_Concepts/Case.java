package OOPS_Concepts;

public class Case {

	private String Model;
	private String MAnufacturer;
	
	private String powerSupply;
	private Dimensions dimensions;
	
	
	public Case(String model, String mAnufacturer, String powerSupply, Dimensions dimensions) {
		super();
		Model = model;
		MAnufacturer = mAnufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}
	
	
	public void pressPowerButton() {
		System.out.println("Power buttin pressed");
	}
	
}
