package org.techinfo;

import org.techinfo.phone.Phone;
import org.techinfo.phone.Samsung;
import org.techinfo.phone.Nokia;

public class Polymorephism {
	public static void main(String[] args) {
//		Phone phone = new Phone("Nokia 3310");
//		System.out.println(phone.getModel());
//		System.out.println(phone.feature());
//		SamsungNote8 note8 = new SamsungNote8("Note 9");
//		note8.features();
		Phone nokia3310 = new Polymorephism().phone(1);
		System.out.println(nokia3310.getModel());
		nokia3310.features();
		
		
		Phone note8 = new Polymorephism().phone(2);
		System.out.println(note8.getModel());
		note8.features();
		
	}
	
	public Phone phone(int dailyDriver) {
		switch(dailyDriver) {
		case 1: return new Nokia("3310");
		case 2: return new Samsung("Note 5");
		}
		return null;
	}

}
