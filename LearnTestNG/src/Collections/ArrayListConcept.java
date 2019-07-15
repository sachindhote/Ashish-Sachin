package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= new int[3]; // this is static array, its size is fixed
		
		ArrayList ls=new ArrayList(); //this is non generic array list as we did not defined what type of element should be stores in list
		
		ls.add(10);
		ls.add(20);
		ls.add(30);
		System.out.println(ls.size());
		
		ls.add(40);
		ls.add(50);
		ls.add(10.3);
		ls.add("sachin");
		ls.add('a');
		ls.add(true);
		
		System.out.println(ls.size());	//to get size of arraylist
		
		System.out.println(ls.get(2)); //to get random elemnt from arraylist
		
		//to print all elements of array list we should use 
		//for Loop
		// Iterator
		for(int i=0; i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
		
		// generic vs non-generic
		ArrayList<Integer> ls1=new ArrayList<Integer>();
		ls1.add(10);
		//ls1.add(10.2);	// cannot store float values as arraylist is of Integer type
		//ls1.add("sachin");	// cannot store float values as arraylist is of Integer type
		
		
		//create Employee class objects
		Employee E1 =new Employee("Sachin",23,"Mechanical");
		Employee E2 =new Employee("Pallavi",23,"QA");
		Employee E3 =new Employee("Sanavi",23,"Dev");
		
		ArrayList<Employee> arl=new ArrayList<Employee>();
		arl.add(E1);
		arl.add(E2);
		arl.add(E3);
		
		//to print the values in arraylist use the Iterator 
		Iterator<Employee> it=arl.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name+"  "+emp.age+"  "+emp.dept);
		}
		

	}

}
