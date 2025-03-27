package Prgpractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveduplicateusingSet {
	
	public static void main (String[]args) {
		String str1="programming";
		StringBuilder sb=new StringBuilder();
	  Set<Character>  set=new LinkedHashSet();
	  for(int i=0;i<str1.length();i++) {
		  set.add(str1.charAt(i));
	  }
	  for(Character c:set) {
		  sb.append(c);
	  }
	  System.out.println(sb);
	}
}