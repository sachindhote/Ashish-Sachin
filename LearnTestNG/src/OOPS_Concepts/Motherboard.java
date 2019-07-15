package OOPS_Concepts;

public class Motherboard {

	private String model;
	private String manufacturer;
	private int ramSlots;
	private int cardSLots;
	private String bios;
	
	public Motherboard(String model, String manufacturer, int ramSlots, int cardSLots, String bios) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSLots = cardSLots;
		this.bios = bios;
	}
	
	public void loadProgram(String programName) {
		System.out.println("Program name = "+programName);
	}
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getRamSlots() {
		return ramSlots;
	}
	public int getCardSLots() {
		return cardSLots;
	}
	public String getBios() {
		return bios;
	}
	
	
	
}
