/*
*
*	1.	Creational
	
	How efficiently you can create an object
	
	2.	Behavioral 
	
	Interactions between object. How one object will behave with other

	3.Structural 
	
	How the object are compose. Is there inheritance (IS-A relationship,HAS-A relationship)
	
	
	
	
	1.1 Singleton
	
		
		Only have one instance of a particular class.
		Java.lang.system ---> only runs on one system…
		When programs runs on multiple jvm, it has a one instance per jvm
	
		Private Constructor
		Enum--
		JEE7 annotation @singleton will make class singleton..
		Should be avoided as much as possible, because hard to unit test.
		In Spring all the beans are singleton...
		
		https://www.geeksforgeeks.org/singleton-design-pattern/
		
	1.2	Factory
	
		In Factory pattern, we create object without exposing the creation logic to client and the client use 
		the same common interface to create new type of object.
		https://www.geeksforgeeks.org/design-patterns-set-2-factory-method/

*/
package com.pranav.ctci6.DesignPattern;