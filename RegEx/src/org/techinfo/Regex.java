package org.techinfo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		int count =0;
		Pattern p = Pattern.compile("ab");
		Matcher macher = p.matcher("ababbabab");
		while(macher.find()) {
			System.out.println(macher.start()+"***"+macher.end()+"***"+macher.group());
			count++;
		}
		System.out.println(count);
		
	}

}
