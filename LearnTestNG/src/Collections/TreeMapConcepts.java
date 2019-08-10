package Collections;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapConcepts {
	
	public static void main(String [] args) {
		
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(1,"Selenium");
		tm.put(2,"QTP");
		tm.put(3,"Test Complete");
		tm.put(4,"RFT");
		tm.put(5,"Load Runner");
		tm.put(0,"Katalon");
		
		for(int i=0; i<tm.size();i++) {
		System.out.println(tm.get(i));
		}
		System.out.println("***********************************");
		for(Integer j : tm.keySet()) {
			System.out.println(tm.get(j));
		}
		
	}

}
