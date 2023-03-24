package org.techingo;

public class C extends B{
	public static void main(String[] args) {
		C c = new C();
		c.setValues(200);
		c.setValue(11, 12);
		System.out.println(c.getValues());
		System.out.println(c.getValue());
	}

}
