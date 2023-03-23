package org.techinfo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		Matcher m = p.matcher("abc@bcdZDA9&#4re");
		while(m.find()) {
			System.out.println(m.start()+"***"+m.group());
		}

	}

}
