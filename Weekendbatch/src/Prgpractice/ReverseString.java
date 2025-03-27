package Prgpractice;

public class ReverseString 
{
	// Method to reverse a string
    public static String reverseString(String str1) {
        StringBuilder reversedStr = new StringBuilder(str1);
        return reversedStr.reverse().toString();
    }
	public static void main(String[] args) {
		String str="java program";
	String	revstr=reverseString(str);
	System.out.println(revstr);
	
	}
}
