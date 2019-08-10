package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String [] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Selenium");
		hm.put(2,"QTP");
		hm.put(3,"Test Complete");
		hm.put(4,"RFT");
		hm.put(5,"Load Runner");
		hm.put(6,"QTP");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		//to print all values in hasmap
		for(Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+"  "+ m.getValue());
		}
		//Remove some values from hashmap
		hm.remove(4);
		System.out.println(hm);
		
		HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
		Employee e1=new Employee("Sachin",42,"QA");
		Employee e2=new Employee("Pallavi",37,"R&D");
		Employee e3=new Employee("Sanavi",8,"School");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer, Employee> m: emp.entrySet()) {
			int key=m.getKey();
			Employee e=m.getValue();
			System.out.println(key+"-"+e.name+" "+e.age+"  "+e.dept);
			
		}
	}
}
