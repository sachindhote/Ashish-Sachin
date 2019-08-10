package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashSetConcepts {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		int [] a= {1,4,1,3,7,3,4};
		System.out.println("Print Array List");
		for (int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for (int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		
	
		Iterator<Integer> i=hs.iterator();
		System.out.println("Print HashSet");
		while(i.hasNext()) {
				System.out.println(i.next());
		}
		
	}

}
