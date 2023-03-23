package org.techinfo;

import java.util.regex.Pattern;

public class SplitM {

	public static void main(String[] args) {
//		Pattern p = Pattern.compile("\\s");
//		String[] s = p.split("softwa34re78 solp2vt lm1t");
//		for(String s1:s) {
//			System.out.println(s1);
//		}
		String s = "soft master";
		String[] s1 = s.split("\\s");
		for(String s2: s1) {
			System.out.println(s2);
		}
	}

}
