package org.techinfo.phone;

public class Hello {
	public static void main(String[] args) {
//		OnePlus5 phone = new OnePlus5();
//		int processor = phone.processor();
//		System.out.println("processor: "+processor);
		Phone phone = new Iphone();
		Phone phone1 = new OnePlus5();
		System.out.println("processor: "+phone.processor());
		System.out.println("Space In GB: "+ phone.spaceInGB());
		System.out.println("OS: "+ phone.os());
		System.out.println("processor: "+phone1.processor());
		System.out.println("Space In GB: "+ phone1.spaceInGB());
		System.out.println("OS: "+ phone1.os());
				
	}
}
