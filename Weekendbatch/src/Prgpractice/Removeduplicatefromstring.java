package Prgpractice;

import java.util.HashSet;

public class Removeduplicatefromstring 
{
	    // Method to remove duplicates
	    public static String removeDuplicates(String str) {
	        // Create a HashSet to store characters and avoid duplicates
	        HashSet<Character> set = new HashSet<>();
	        
	        // Create a StringBuilder to store the result
	        StringBuilder result = new StringBuilder();

	        // Loop through the original string
	        for (int i = 0; i < str.length(); i++) {
	            // If the character is not in the set, add it to the set and result
	            if (set.add(str.charAt(i))) {
	                result.append(str.charAt(i));
	            }
	        }
	       // Convert StringBuilder to string and return
	        return result.toString();
	    }
	    public static void main(String[] args) {
	        // Input string
	        String str = "programming";

	        // Remove duplicates from the string
	        String result = removeDuplicates(str);

	        // Output the result
	        System.out.println("Original String: " + str);
	        System.out.println("String after removing duplicates: " + result);
	    }
	    
	}