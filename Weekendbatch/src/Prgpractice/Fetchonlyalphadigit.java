package Prgpractice;

public class Fetchonlyalphadigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="jaava.2@#78";
	char[]	ch=str.toCharArray();
    for(int i=0; i<=ch.length-1;i++) {
    	   if(Character.isAlphabetic(ch[i])) {
    		   System.out.println(ch[i]);
    	   }
    	   if(Character.isDigit(ch[i])) {
    		   System.out.println(ch[i]);
    	   }
    }
	}

}
