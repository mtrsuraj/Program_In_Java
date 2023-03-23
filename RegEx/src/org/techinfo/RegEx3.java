package org.techinfo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx3 {

	public static void main(String[] args) {
//		Pattern p = Pattern.compile("a");//Exactly one a
//		Pattern p = Pattern.compile("a+");//Atleast One a
//		Pattern p = Pattern.compile("a*");//Any Number of a's including zero number also
		Pattern p = Pattern.compile("a?");//Atmost one a
		Matcher m = p.matcher("abaabbaaabbbcccdddd88jhh");
		while(m.find()) {
			System.out.println(m.start()+"***"+m.group());
		}

	}

}
