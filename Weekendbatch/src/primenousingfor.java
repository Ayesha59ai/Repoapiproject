
public class primenousingfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=5;
		int count=0;
		for(int i=1;i<=no;i++) {
			    if(no%i==0) {
			    	count++;
			    }
			
		}
		if(count==2) {
			System.out.println(no+"it is a prime no");
		}
		else {
			System.out.println("its not a prime no");
		}

	}

}
