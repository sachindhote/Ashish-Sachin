package OOPS_Concepts;

public class Printer {
	
	private int currenttonnerLevel;
	private int numberOfPagesPrinted;
	private boolean duplexPrinter;
	
	public Printer(int currenttonnerLevel, boolean duplexPrinter) {
		if(currenttonnerLevel >-1 && currenttonnerLevel <=100)
		{
			this.currenttonnerLevel = currenttonnerLevel;
		}else {
			this.currenttonnerLevel=-1;
		}

		this.duplexPrinter = duplexPrinter;
		this.numberOfPagesPrinted = 0;
	}

	public int fillTonner(int tonneramount) {
		
		if (tonneramount>0 && tonneramount<=100)
		{
			if(this.currenttonnerLevel+tonneramount>100)
			{
				return -1;
			}
			
			//System.out.println("Printer current tonner level is"+ (this.currenttonnerLevel+tonneramount));
			return (this.currenttonnerLevel+tonneramount);
		}else {
			return -1;
		}
	}
	public int printPage(int pages) {
		int totalprintedPages=this.numberOfPagesPrinted+pages;
		//System.out.println("Total number of pages printed - "+ totalprintedPages);
		if (this.duplexPrinter) {
			return totalprintedPages/2;
		}else
			return totalprintedPages;
	}
	
	
	public int getcurrenttonnerLevel() {
		return currenttonnerLevel;
	}

	public int getNumberOfPagesPrinted() {
		return numberOfPagesPrinted;
	}

	public boolean isDuplexPrinter() {
		return duplexPrinter;
	}
	
	
	
	

}
