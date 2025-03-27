
public class Primenumber 
{
	public static void main(String[] args) {
		int no=5;
		int i=1;
		boolean prime=true;
		while(i<no) {
			      if(no%i==0) {
			    	  
			    	  prime=false;
			    	  i=i+1;
			      }
			      System.out.println("not a prime");
			      if(prime==true) {
			    	  System.out.println("prime");
			      }
			
		}
	}

}
