package org.techinfo.phone;

public class Phone {
	private String model;

	public Phone(String model) {
		this.model=model;
	}
	public void features() {
		System.out.println("Feature phone");
//		return true;
	}
	public String getModel() {
		return model;
	}
}
