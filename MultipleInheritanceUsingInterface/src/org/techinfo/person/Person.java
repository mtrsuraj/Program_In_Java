package org.techinfo.person;

public class Person implements IsAlive, LiveLife{
	public void speak() {
		System.out.println("Shares his/her thoughts");
	}

	@Override
	public void message() {
		System.out.println("Life is journey, keep moving and meet new people. ");
		
	}

	@Override
	public void breathe() {
		 System.out.println("be alive; remain living");
		
	}
//	public abstract void eat();
	

}
