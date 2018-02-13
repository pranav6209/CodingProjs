package com.pranav.java8;

/*
Just migrated application to make sure code compile and run on java 8 without a syntax error.
we haven't used java 8 features.


but i know following features.



https://www.javatpoint.com/java-8-features


*/
import java.util.ArrayList;
import java.util.List;

public class java8Features {
	//Collection<String> collection = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		List<Integer> mylist= new ArrayList<Integer>();
		
		mylist.add(1);
		mylist.add(2);
		mylist.add(3);
		mylist.add(4);
		
		
/*		
 * B're Java -8
 * 
 * for (Integer integer : mylist) {
			
			System.out.println(integer);
			
		}*/
		
/*			Java -8 for each without lambda	
 * 			
 * 			mylist.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				
				System.out.println(t);
				
			}
			
			
		});
		*/
	
		//Java -8 for each with lambda	
		//	mylist.forEach(x -> System.out.println(x));
		
		
		// Java -8 with lambda block
		mylist.forEach(x -> {
			System.out.println("Testing");
			System.out.println(x);
		});
		
	}

	
	
	

}
