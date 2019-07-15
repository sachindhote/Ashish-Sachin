package OOPS_Concepts;

//import net.bytebuddy.agent.builder.AgentBuilder.Default.Transformation.Resolution;

public class Monitor {
	
	private String Model;
	private String MAnufacturer;
	private int size;
	private Resolution nativeResolution;
	
	
	public Monitor(String model, String mAnufacturer, int size, Resolution nativeResolution) {
		super();
		Model = model;
		MAnufacturer = mAnufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixelAt(int x,int y,String Color) {
		System.out.println("Drawing pixel at "+ x + ","+ y+"in colour"+ Color);
	}

	public String getModel() {
		return Model;
	}

	public String getMAnufacturer() {
		return MAnufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}

}
