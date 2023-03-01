package org.studyeasy.vehicles;
import org.studyeasy.parent.*;

public class Bike extends Vehicle{
	private String handle;
//	public String engine;
//	public String lights;
	
	public Bike(){
		super();
		this.handle = "short";
		
	}
	public Bike(String handle) {
		this.handle = handle;
	}
	
	public String getHandle() {
		return handle;
	}
//	public void setHandle(String handle) {
//		this.handle = handle;
//	}
	
	

}
