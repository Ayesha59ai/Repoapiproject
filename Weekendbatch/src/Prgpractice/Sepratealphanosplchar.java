package Prgpractice;

public class Sepratealphanosplchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="jaava.2@#78";
		char[]	ch=str.toCharArray();
		String alpha=" ";
		String num=" ";
		String spl=" ";
	    for(int i=0; i<=ch.length-1;i++) {
	    	   if(Character.isAlphabetic(ch[i])) {
	    		 alpha=alpha+ch[i];
	    	   }
	    	   
	    	   else if(Character.isDigit(ch[i])){
	    		   num=num+ch[i]; 
	    	   }
	    	   else {
	    		   spl=spl+ch[i];
	    	   }
	    	   }
	    System.out.println(alpha);
	    System.out.println(num);
	    System.out.println(spl);
	    
	}
}

