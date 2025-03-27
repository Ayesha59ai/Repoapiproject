package Prgpractice;

public class Removeduplicatefrmstringeasy {
    // Method to remove duplicates from a string
    public static String removeDuplicates(String str) {
        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Loop through each character of the original string
        for (int i = 0; i < str.length(); i++) {
            // If the character is not already in the result string, add it
            if (result.indexOf(String.valueOf(str.charAt(i))) == -1) {
                result.append(str.charAt(i));
            }
        }
        
        // Return the result as a string
        return result.toString();
    }
	public static void main(String[] args) {
        // Input string
        String str = "programming";

        // Remove duplicates from the string
        String result = removeDuplicates(str);
        
        result.append(123);

        // Output the result
        System.out.println("Original String: " + str);
        System.out.println("String after removing duplicates: " + result);
    }
}
