package org.techinfo;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person john = new Person("john-Doe", 34, "Male");
		Person jone = new Person();
		System.out.println(john);
		System.out.println(jone);
		john.setAge(-78);
		System.out.println(john);
	}

}
