package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListConcept {
	
	public static void main(String [] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		//add
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		
		//print
		System.out.println("Contents of Linked List" + ll);
		
		//addfirst
		ll.addFirst("Katalaon");
		
		//addlast
		ll.addLast("Automation");
		
		System.out.println("Contents of Linked List" + ll);
		
		//get
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		
		//set
		ll.set(0,"Manual");
		System.out.println("Contents of Linked List" + ll);
		
		//Remove
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents of Linked List" + ll);
		
		//How to print all values of link list
		//for loop
		for(int n=0; n<ll.size();n++)
		{
			System.out.println(ll.get(n));
		}
				
		//advance for loop
		
		for(String str : ll) {
			System.out.println(str);
		}
		
		//Iteratoor
	
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	

}
