package com.pranav.ctci6.stacksqueue;

import java.util.LinkedList;

public class I_AnimalShelter {

	public static class AnimalShelter {

		/* Two queues created, one each for dog and cat */
		
		// AS we are creating LinkedList of type DOG and Cat we have to create a class Dog and Cat.
		//Also we are creating a generic class Animal to honor dequeAny()..It is a good to extend that for 
		// Dog and Cat.
		
		LinkedList<Dog> dogs = new LinkedList<>();
		 LinkedList<Cat> cats = new LinkedList<>();
		/* Counter to assign order for each Animal */
		int order = 0;

		/**
		 * Method to enqueue the animal
		 * 
		 * @param animal
		 */
		public void enqueue(Animal animal) {
			/*
			 * If Animal is present, set order and increase the order size
			 */
			if (animal != null) {
				animal.setOrder(order);
				order++;
				/*
				 * Check what type of Animal it is, and add to that specific
				 * queue
				 */
				if (animal instanceof Dog) {
					dogs.addLast((Dog) animal);
				} else if (animal instanceof Cat) {
					cats.addLast((Cat) animal);
				}
			}
		}

		/**
		 * Method to dequeue any animal
		 * 
		 * @return {@link Animal}
		 */
		public Animal dequeueAny() {
			/*
			 * If there are no dogs, dequeue cats and vice versa
			 */
			if (dogs.size() == 0) {
				dequeueCat();
			} else if (cats.size() == 0) {
				dequeueDog();
			}
			/* Find the first dog and cat in the queue */
			Dog dog = dogs.peek();
			Cat cat = cats.peek();
			/* Whichever is older entry, return that */
			if (dog.isOlderThen(cat)) {
				return dogs.poll();
			} else {
				return cats.poll();
			}
		}

		/**
		 * Method to dequeue dog
		 * 
		 * @return {@link Dog}
		 */
		public Dog dequeueDog() {
			return dogs.poll();
		}

		/**
		 * Method to dequeue cat
		 * 
		 * @return {@link Cat}
		 */
		public Cat dequeueCat() {
			return cats.poll();
		}

		/**
		 * Method to get the size of Animal shelter
		 * 
		 * @return {@link int}
		 */
		public int size() {
			return dogs.size() + cats.size();
		}

		/**
		 * Abstract class Animal
		 * 
		 * @author Deepak
		 */
		public static abstract class Animal {

			/* Order of the animal and name */
			
			// order is used as a time stamp so we can compare insertion order...
			
			private int order;
			protected String name;

			/**
			 * Constructor
			 * 
			 * @param name
			 */
			public Animal(String name) {
				this.name = name;
			}

			public int getOrder() {
				return order;
			}

			public void setOrder(int order) {
				this.order = order;
			}

			/**
			 * Compare two animals and find out which is older
			 */
			public boolean isOlderThen(Animal animal) {
				
				// order will be initialized when object is created so we can use that for comparison.
				return this.order < animal.getOrder();
			}

		}

		/**
		 * Class Cat which extends Animal
		 *
		 */
		public static class Cat extends Animal {

			/**
			 * Constructor to add a cat
			 * 
			 * @param name
			 */
			
			// this will call super class constructor and set a name...
			public Cat(String name) {
				super(name);
			}
		}

		/**
		 * Class Dog which extends Animal
		 * 
		 */
		public static class Dog extends Animal {

			/**
			 * Constructor to add a Dog
			 * 
			 * @param name
			 */
			
			// this will call super class constructor and set a name...
			public Dog(String name) {
				super(name);
			}
		}

	}

}
