package org.techinfo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
	public static void main(String[] args) {
//		Pattern p = Pattern.compile("\\s");//Space character
//		Pattern p = Pattern.compile("\\S");//Any Character Except Space
//		Pattern p = Pattern.compile("\\d");//digit any digit
//		Pattern p = Pattern.compile("\\D");//any character except digit
//		Pattern p = Pattern.compile("\\w");//any word character(any alpha numeric character [A-Za-z-0-9])
//		Pattern p = Pattern.compile("\\W");//Except word character(Special character)
		Pattern p = Pattern.compile(".");//any sysmbol includeing special character also
		Matcher m = p.matcher("abc@908&$HB   U^swf");
		while(m.find()) {
			System.out.println(m.start()+"***"+m.group());
		}
	}

}
